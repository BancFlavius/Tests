package NestedLoops;

public class T54 {
    public static void main(String[] args) {
        for (int i = 1; i <= 45; i++) {
            for (int n = 1; n <= 45; n++) {
                for (int j = 1; j <= 45; j++) {
                    for (int l = 1; l <= 45; l++) {
                        int sum = i+n+j+l;
                        int a = i + 2;
                        int b = n - 2;
                        int c = j * 2;
                        int d = l / 2;
                        if (sum==45 && a==b && b==c && c==d ) {
                            System.out.println(i + ", " + n + ", " + j + ", " + l + " = 45");
                        }
                    }
                }
            }
        }
    }
}
