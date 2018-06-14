package NestedLoops;

public class T51 {
    public static void main(String[] args) {
        for(int i = 10; i<100;i++){
            System.out.print(i+", ");
            for(int n = i; n<=i; n++){
                int[] intTab = String.valueOf(i).chars().map(Character::getNumericValue).toArray();
                int a = intTab[0];
                int b = intTab[1];
                System.out.println( intTab[0]+" + "+intTab[1]+" = "+(a+b));
            }
        }
    }
}
