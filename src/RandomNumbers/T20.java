package RandomNumbers;

public class T20 {
    public static void main(String[] args) {
        System.out.println("Baby Blackjack");
        System.out.println("");

        int playerCardOne = (int)(Math.random()*10);
        int playerCardTwo = (int)(Math.random()*10);
        int playerTotal = playerCardOne+playerCardTwo;
        System.out.println("You drew " + playerCardOne+ " and "+playerCardTwo);
        System.out.println("Your total is: "+ playerTotal);
        System.out.println("");

        int dealerCardOne = (int)(Math.random()*10);
        int dealerCardTwo = (int)(Math.random()*10);
        int dealerTotal = dealerCardOne+dealerCardTwo;

        System.out.println("The dealer has " + dealerCardOne+ " and " + dealerCardTwo);
        System.out.println("Dealer's total is "+ dealerTotal);
        System.out.println("");

        if(dealerTotal < playerTotal) {
            System.out.println("You win!");
        }else if(dealerTotal == playerTotal){
            System.out.println("It's a draw.");
        } else{
            System.out.println("The dealer won!");
        }
    }
}
