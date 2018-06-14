package NestedLoops;

public class T49 {


    public static void main(String[] args) {

            int table = 12;
            System.out.print(" x | ");
            for(int i = 1; i <= table; i++){
                System.out.print(sort(i) + " ");
            }
            System.out.println();
            System.out.print("===+");
            for(int i = 1; i <= table; i++){
                System.out.print("====");
            }
            System.out.println();
            for(int i = 1; i <= table; i++){
                System.out.print(sort(i) + "| ");
                for(int n = 1; n <=table; n++){
                    System.out.print(sort(i*n) + " ");
                }
                System.out.println();
            }
        }

        public static String sort(int i){

            String space;
            if(i <10) space = "  " + i;
            else if(i < 100) space = " " + i;
            else space = "" + i;
            return space;
        }

    }