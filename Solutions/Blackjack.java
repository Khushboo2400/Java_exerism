public class Blackjack {

    public int parseCard(String card) {
    int x =0;
    switch(card){
     case "ace":
        x=11;
    break;
    case "ten" :
    case "jack" :
    case "queen" :
    case "king" :
        x=10;    
    break;
  case "two":
        x=2;
    break;
  case "three":
        x=3;
    break;
  case "four":
        x=4;
    break;
  case "five":
        x=5;
    break;
  case "six":
        x=6;
    break;
  case "seven":
        x=7;
    break;
  case "eight":
        x=8;
    break;
  case "nine":
        x=9;
    break;       
    }
return x;
    }
    public boolean isBlackjack(String card1, String card2) {
    int x = parseCard(card1);
    int y =parseCard(card2);
    int z =  x+y ;
     boolean ans= false;
        if(z==21){
         ans =true;
     }
     return ans;
    }

    public String largeHand(int handScore, int dealerScore) {    
        String ans= "";
        if(handScore == 22 ) {
            ans= "P";
        }
        else if( dealerScore >=10) {
            ans="S";
        }
        else {
            ans="W";
        }
     return ans;   
    }

    public String smallHand(int handScore, int dealerScore) {
    String ans ="";
        if(handScore >=17){
            ans ="S";
        }
        else if(handScore <= 11){
            ans ="H";
        }
        else if(handScore>=12 && handScore<=16){
            if(dealerScore >=7)
            {
                ans="H";
            }
            else{
                ans ="S";
            }
        }    
      return ans;  
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(handScore, dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
