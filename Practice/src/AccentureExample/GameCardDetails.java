package AccentureExample;

import java.util.Scanner;

public class GameCardDetails{
    public CardPoints getCardDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter card id");
        int cardId = sc.nextInt();
        System.out.println("Enter card holder name");
        String name = sc.next();
        System.out.println("Enter balance points");
        int balancePoints = sc.nextInt();
        while (balancePoints<0){
            System.out.println("Balance points should be positive");
            System.out.println("Enter balance points");
            balancePoints = sc.nextInt();
        }


        CardPoints cardPoints = new CardPoints(cardId,name,balancePoints);
        return cardPoints;
    }
    public int getPointUsage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter points should be used");
        int usedPoints = sc.nextInt();
        if (usedPoints>0){
            return usedPoints;
        }
        return 0;
    }

    public static void main(String[] args) {
        GameCardDetails gameCardDetails = new GameCardDetails();
        CardPoints details = gameCardDetails.getCardDetails();
        int usagePoints=gameCardDetails.getPointUsage();
        if (details.withdrawPoints(usagePoints)){
            System.out.println("Sorry!!! No enough points");
        }else {
            System.out.println("Balance points after used: " + (details.getBalancePoints() - usagePoints));
        }
    }
}

class CardPoints {
    private int cardId;

    private String holderName;

    private int balancePoints;

    public CardPoints() {
        super();
    }

    public CardPoints(int cardId, String holderName, int balancePoints) {
        this.cardId = cardId;
        this.holderName = holderName;
        this.balancePoints = balancePoints;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public int getBalancePoints() {
        return balancePoints;
    }

    public void setBalancePoints(int balancePoints) {
        this.balancePoints = balancePoints;
    }

    public boolean withdrawPoints(int points){
        if (points>=getBalancePoints()){
            return true;
        }
        return false;
    }
}
