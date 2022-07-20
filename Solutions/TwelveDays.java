import java.util.Arrays;

class TwelveDays {
String[] part ={"a Partridge in a Pear Tree.\n", "two Turtle Doves", "three French Hens", "four Calling Birds", "five Gold Rings", "six Geese-a-Laying", "seven Swans-a-Swimming", "eight Maids-a-Milking", "nine Ladies Dancing", "ten Lords-a-Leaping", "eleven Pipers Piping", "twelve Drummers Drumming"};

String [] days ={"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};

String start = "On the %s day of Christmas my true love gave to me: ";
    
String verse(int verseNumber) {
    String verse = String.format(this.start,this.days[verseNumber-1]);
    String str = part[0];
     String s ="";
        for(int a=verseNumber-1;a>0;a--){
            s =s.concat(part[a])+ ", ";
        }
        if(verseNumber>1){
            s= s+ "and " +str;
        return verse +s;
        }
        return verse+str;
 }

    String verses(int startVerse, int endVerse) {
    String s="";
    for(int i=startVerse;i<=endVerse-1;i++){
        s = s+verse(i);
        s+="\n";
    }
    return s+verse(endVerse);
 }
    String sing() {
  return verses(1,12);
}

}
