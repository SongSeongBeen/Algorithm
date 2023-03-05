import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.print(new Scanner(System.in).next().replaceAll("c=|c-|dz=|d-|lj|nj|s=|z="," ").length());
    }
}