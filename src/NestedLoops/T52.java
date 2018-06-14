package NestedLoops;

public class T52 {
    public static void main(String[] args) {
        for(int i = 10; i <= 56; i++){
            int[] intTab = String.valueOf(i).chars().map(Character::getNumericValue).toArray();
            int a = intTab[0];
            int b = intTab[1];
            if(a+b > 10){
                System.out.println(i);
            }
        }

        for(int i = 10; i < 100; i++){
            for(int n = 10; n < 100; n++){
                int[] intTab = String.valueOf(i).chars().map(Character::getNumericValue).toArray();
                int a = intTab[0];
                int b = intTab[1];
                int minus = i - n;

                if(a+b == minus){
                    System.out.println(i + ", " + n);
                }
            }
        }
    }

}
