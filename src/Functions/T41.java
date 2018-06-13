package Functions;

public class T41 {

    public static boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        } else
            return false;
    }

    public static boolean isDevisibleBy3(int n){
        if(n % 3 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        for(int i = 1; i<=20; i++){


            if(isEven(i)){
                System.out.print(i);
                System.out.print(" <");
                if(isDevisibleBy3(i)){
                    System.out.println("=");
                } else
                    System.out.println("");
            } else if(isDevisibleBy3(i)){
                System.out.print(i);
                System.out.print(" =");
                if(isEven(i)){
                    System.out.println("<");
                } else
                    System.out.println("");
            } else
                System.out.println(i);

        }
    }
}
