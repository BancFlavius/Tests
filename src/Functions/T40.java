package Functions;

import java.util.Scanner;


public class T40 {

    static Scanner input = new Scanner(System.in);

    int keychains;

    public static void menu(){
        System.out.println("1. Add keychains to Order");
        System.out.println("2. Remove keychains from Order");
        System.out.println("3. View current Order");
        System.out.println("4. Checkout");
    }

    public int add_keychains(){

        System.out.println("");
        System.out.print("You have " + keychains +" keychains. How many to add? " );
        keychains = input.nextInt();
        System.out.println("You now have "+keychains+" keychains");
        System.out.println("");
        return keychains;
    }

    public void remove_keychains(){

        System.out.println("");
        System.out.print("You have "+keychains+" keychains. How many to remove? ");
        int remove = input.nextInt();
        if(remove > keychains){
            System.out.println("You don't have that many.");
            remove_keychains();
        } else {
            keychains = keychains - remove;
        }
        System.out.println("You now have "+keychains+" keychains.");
        System.out.println("");
    }

    public void view_order(){

        System.out.println("");
        System.out.println("You have "+keychains+" keychains.");
        System.out.println("Keychains cost $10 each.");
        System.out.println("Total cost is $"+ keychains*10+".");
        System.out.println("");
    }

    public void checkout(){

        System.out.println("");
        System.out.print("What is your name? ");
        String name = input.next();
        System.out.println("");
        System.out.println("You have "+keychains+" keychains.");
        System.out.println("Total cost is $"+keychains*10+".");
        System.out.println("Thanks for your order, "+name+"!");
        System.out.println("");
    }

    public static void main(String[] args) {

        T40 person = new T40();
        boolean temp = true;

        System.out.println("Keychain shop");
        System.out.println("");
        menu();

        System.out.println("");
        System.out.print("Please enter your choice: ");
        int choice = input.nextInt();

        do{
            switch (choice){
                case 1: person.add_keychains();break;
                case 2: person.remove_keychains();break;
                case 3: person.view_order();break;
                case 4: person.checkout();temp = false;break;
                default:
                    System.out.println("OUT OF BOUNDS, TRY AGAIN.");break;
            }

            if(temp) {
                menu();
                System.out.println("");
                System.out.print("Please enter your choice: ");
                choice = input.nextInt();
            }

        }while(temp);


    }
}
