class Solution {

    private class Numbers {
        private int a, b, c;
        private int sum, sqrtSum, powSum;

        private Numbers(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.sum = a + b + c;
            this.sqrtSum = (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
            this.powSum = (int)(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
        }

        private boolean allEqual() {
            return a == b && a == c;
        }

        private boolean allDifferent() {
            return a != b && a != c && b != c;
        }

        private int calculate() {
            if (allDifferent()) {
                return sum;
            } else if (allEqual()) {
                return sum * sqrtSum * powSum;
            } else {
                return sum * sqrtSum;
            }
        }
    }

    public int solution(int a, int b, int c) {
        Numbers numbers = new Numbers(a, b, c);
        return numbers.calculate();
    }
}
