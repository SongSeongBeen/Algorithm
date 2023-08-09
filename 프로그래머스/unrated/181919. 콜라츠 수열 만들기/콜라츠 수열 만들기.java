import java.util.ArrayList;

public class Solution {
    public int[] solution(int n) {
        Collatz collatz = new Collatz(n);
        ArrayList<Integer> sequence = collatz.generateSequence();

        int[] answer = new int[sequence.size()];
        for(int i = 0; i < sequence.size(); i++) {
            answer[i] = sequence.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(6);
        for(int num : result) {
            System.out.print(num + " ");
        }
    }
}

class Collatz {
    private int number;

    public Collatz(int number) {
        this.number = number;
    }

    public ArrayList<Integer> generateSequence() {
        ArrayList<Integer> sequence = new ArrayList<>();
        int temp = number;

        while(temp != 1) {
            sequence.add(temp);
            if(temp % 2 == 0) {
                temp = temp / 2;
            } else {
                temp = 3 * temp + 1;
            }
        }
        sequence.add(1);

        return sequence;
    }
}


