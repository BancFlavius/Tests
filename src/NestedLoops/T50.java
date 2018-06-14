package NestedLoops;

public class T50 {
    public static void main(String[] args) {
        for(int i = 10; i<=99;i++){
            for(int n = 10; n<=99; n++){
                if((i + n == 60) && (i - n == 14)){
                    System.out.println("first number = "+i +", second number = " + n);
                }
            }
        }
    }
}
