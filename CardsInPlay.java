package sample;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Random;

public class CardsInPlay{
private Image image;


public static ArrayList<String> Card (String Card){
    return GetHand();

}

    public static int getScore() {

        ArrayList<String> cards = new ArrayList<String>();
        cards = GetHand();
        String card0 = cards.get(0);
        String card1 = cards.get(1);
        String card2 = cards.get(2);
        String card3 = cards.get(3);
        String card4 = cards.get(4);


        String suit0 = getSuit(card0);
        String suit1 = getSuit(card1);
        String suit2 = getSuit(card2);
        String suit3 = getSuit(card3);
        String suit4 = getSuit(card4);

        String val0 = getVal(card0);
        String val1 = getVal(card1);
        String val2 = getVal(card2);
        String val3 = getVal(card3);
        String val4 = getVal(card4);


        Integer Ival0 = Integer.valueOf(getVal(card0));
        Integer Ival1 = Integer.valueOf(getVal(card1));
        Integer Ival2 = Integer.valueOf(getVal(card2));
        Integer Ival3 = Integer.valueOf(getVal(card3));
        Integer Ival4 = Integer.valueOf(getVal(card4));


        int score = 0;

        if ((Ival1 + Ival2 == 15) || (Ival1 + Ival3 == 15) || (Ival1 + Ival4 == 15) || (Ival2 + Ival3 == 15) || (Ival2 + Ival4 == 15 || (Ival3 + Ival4 == 15))) {
            score = +2;
        }
        if ((val1 == val2) || (val1 == val3) || (val1 == val4) || (val2 == val3) || (val2 == val4) || (val4 == val3)) {
            score = +2;
        }
        if (suit1 == suit2 && suit2 == suit3 && suit3 == suit4) {
            score = +4;
        }
        if (suit0 == suit1 && suit1 == suit2 && suit2 == suit3 && suit3 == suit4) {
            score = +5;
        }
        if (suit0 == suit1 || suit0 == suit2 || suit0 == suit3 || suit0 == suit4) {
            score = +1;
        }
        if (Ival1 + Ival2 + Ival3 + Ival3 == 31) {
            score = +2;
        }
        if (Ival0 + Ival1 + Ival2 + Ival3 + Ival4 < 31) {
            score = +1;
        }
        if (val1.equals(val4) && val4.equals(val2) || (val1.equals(val2) && val2.equals(val3) ||
                (val1.equals(val2) && val2.equals(val3) ||
                        (val1.equals(val3) && val3.equals(val4) ||
                                (val1.equals(val2) && val2.equals(val4) ||
                                        (val1.equals(val3) && val3.equals(val2) ||
                                                (val4.equals(val1) && val1.equals(val2) ||
                                                        (val4.equals(val2) && val2.equals(val1) ||
                                                                (val4.equals(val3) && val3.equals(val1) ||
                                                                        (val4.equals(val3) && val3.equals(val2) ||
                                                                                (val4.equals(val2) && val2.equals(val3) ||
                                                                                        (val3.equals(val1) && val1.equals(val2) ||
                                                                                                (val3.equals(val2) && val2.equals(val4) ||
                                                                                                        (val3.equals(val4) && val4.equals(val2) ||
                                                                                                                (val3.equals(val4) && val4.equals(val1) ||
                                                                                                                        (val3.equals(val1) && val1.equals(val4))))))))))))))))) {
            score = +6;
        }


        return score;
    }

    /**
     * Scoring
     * Cards adding up to 15 +2
     * Pair of the same rank +2
     * <p>
     * Three of the same rank +6
     * 4 of the same rank +12
     * <p>
     * Three consecutive cards of consecutive rank +3
     * <p>
     * <p>
     * <p>
     * <p>
     * 4 cards with consecutive rank +4
     * 5 cards with consecutive rank  +5
     * All cards have the same suit (hand/crib)
     * A jack is the same suit as the starter +1
     * two 3 card runs and a pair  9h10d10hjc +8
     * two 4 card runs and a pair 2had3h3c4d +10
     * Triple Run of three cards and a royal pair 8h9d10h10c10d +15
     */


    public static ArrayList<String> GetHand() {

        String[] suits = {"C", "H", "S", "D"};
        String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        ArrayList<String> Hand = new ArrayList<String>();
        Random suit1 = new Random();
        Random value1 = new Random();


        String Cardval1 = values[value1.nextInt(12)];
        String Cardsuit1 = suits[suit1.nextInt(3)];

        String Card = (Cardval1 + Cardsuit1);

        String Card1 = putTogether(Card);

        Hand.add(Card1);


        Random suit2 = new Random();
        Random value2 = new Random();

        String Cardval2 = values[value2.nextInt(12)];
        String Cardsuit2 = suits[suit2.nextInt(3)];

        String Card2 = (Cardval2 + Cardsuit2);

        Hand.add(Card2);


        Random suit3 = new Random();
        Random value3 = new Random();

        String Cardval3 = values[value3.nextInt(12)];
        String Cardsuit3 = suits[suit3.nextInt(3)];

        String Card3 = (Cardval3 + Cardsuit3);


        Hand.add(Card3);

        Random suit4 = new Random();
        Random value4 = new Random();

        String Cardval4 = values[value4.nextInt(12)];
        String Cardsuit4 = suits[suit4.nextInt(3)];

        String Card4 = (Cardval4 + Cardsuit4);


        Hand.add(Card4);

        Random suit5 = new Random();
        Random value5 = new Random();

        String Cardval5 = values[value5.nextInt(12)];
        String Cardsuit5 = suits[suit5.nextInt(3)];

        String Card5 = (Cardval5 + Cardsuit5);


        Hand.add(Card5);


        return Hand;

    }








    public static String putTogether(String Card) {

        String second = getSuit(Card);
        String first = getVal(Card);

        String CardFinal = first + second;

        return CardFinal;
    }


    public static String getSuit(String Card) {

        if (Card.length() == 3) {
            char suits = Card.charAt(2);
            String Suit = Character.toString(suits);
            return Suit;
        } else {

            char suits = Card.charAt(1);

            String Suit = Character.toString(suits);
            return Suit;
        }

    }


    public static String getVal(String Card) {

        if (Card.length() == 3) {
            char val1 = Card.charAt(0);
            char val2 = Card.charAt(1);

            String vals = Character.toString(val1) + Character.toString(val2);
            return vals;
        } else {
            char val = Card.charAt(0);
            String vals = Character.toString(val);

            return vals;
        }


    }
}




















