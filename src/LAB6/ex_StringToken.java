package LAB6;

import java.util.StringTokenizer;

public class ex_StringToken {
    public static void main(String[] args) {

        String msg = "I wotk at RUTS, Nakornsithamarat.Thailand.";
        StringTokenizer tokaen = new StringTokenizer(msg);

        //count word
        System.out.println("Word in message:"+tokaen.countTokens());

        while (tokaen.hasMoreTokens()) {
            System.out.println(tokaen.nextToken());
        }






    }






}
