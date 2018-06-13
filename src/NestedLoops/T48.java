package NestedLoops;

public class T48 {

    public static void main(String[] args) {

        for(int i = 0; i <=5;i++){
            for(int x = 0; x <=5;x++) {
                System.out.print("("+i+","+ x +")");
                if(x == 5){
                    System.out.println("");
                }
            }
        }
    }
}
