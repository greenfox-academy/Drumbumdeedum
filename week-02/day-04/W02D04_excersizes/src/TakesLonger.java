/**
 * Created by danielszalay on 2017. 03. 23..
 */
// When saving this quote a disk error has occurred. Please fix it.
// Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
// Using pieces of the quote variable (instead of just redefining the string)

public class TakesLonger {
  public static void main(String... args){
    String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

    quote = quote.substring(0, quote.indexOf("It")+3) +
        "always takes longer than" + " " +
        quote.substring(quote.indexOf("you"), quote.length());

    System.out.println(quote);
  }
}
