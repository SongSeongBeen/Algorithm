import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        // 장르별 총 재생 횟수를 저장할 HashMap
        Map<String, Integer> genrePlayCount = new HashMap<>();
         // 각 장르별 노래를 우선순위 큐로 관리하기 위한 HashMap
        Map<String, PriorityQueue<Song>> genreSongs = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            genrePlayCount.merge(genres[i], plays[i], Integer::sum);
            genreSongs.computeIfAbsent(genres[i], k -> new PriorityQueue<>(
                (s1, s2) -> {
                    if (s1.playsCount == s2.playsCount) {
                        return Integer.compare(s1.id, s2.id); // 재생 횟수가 같을 때는 고유 번호가 낮은 노래 우선
                    }
                    return Integer.compare(s2.playsCount, s1.playsCount); // 재생 횟수가 많은 노래 우선
                }
            )).add(new Song(i, plays[i]));
        }
        // 장르별 총 재생 횟수를 기준으로 장르를 내림차순으로 정렬
        List<String> sortedGenres = new ArrayList<>(genrePlayCount.keySet());
        sortedGenres.sort((a, b) -> genrePlayCount.get(b) - genrePlayCount.get(a));
        // 결과로 반환할 노래의 고유 번호 목록
        List<Integer> answerList = new ArrayList<>();
        // 정렬된 장르 목록을 순회하면서 각 장르별로 가장 많이 재생된 두 곡을 선택
        for (String genre : sortedGenres) {
            PriorityQueue<Song> songs = genreSongs.get(genre);
            int count = 0;
            while (!songs.isEmpty() && count < 2) {
                answerList.add(songs.poll().id);
                count++;
            }
        }

        return answerList.stream().mapToInt(i -> i).toArray();
    }
     // 노래 정보를 나타내는 클래스. Comparable 인터페이스를 구현하여 우선순위 큐에서의 정렬 기준을 정의
    class Song implements Comparable<Song> {
        int id;          // 노래의 고유 번호
        int playsCount;  // 노래가 재생된 횟수

        Song(int id, int playsCount) {
            this.id = id;
            this.playsCount = playsCount;
        }
        // 노래를 다른 노래와 비교하는 메서드
        @Override
        public int compareTo(Song other) {
            if (this.playsCount == other.playsCount) {
                return Integer.compare(this.id, other.id);
            }
            return Integer.compare(other.playsCount, this.playsCount);
        }
    }
}
