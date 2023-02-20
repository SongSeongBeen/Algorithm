import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        HashSet<Integer> selfNumbers = new HashSet<>();
        
        for (int i = 1; i <= 10000; i++) {
            int n = i;
            int sum = n;
            
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            
            selfNumbers.add(sum);
        }
        
        for (int i = 1; i <= 10000; i++) {
            if (!selfNumbers.contains(i)) {
                System.out.println(i);
            }
        }
    }
}
