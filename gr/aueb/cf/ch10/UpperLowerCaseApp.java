package gr.aueb.cf.ch10;

/**
 * Transforms to Uppercase-lowercase.
 * For instance, ATHENS becomes AtHeNs.
 */
public class UpperLowerCaseApp {

    public static void main(String[] args) {
        String message = "ATHENS";
        StringBuilder sb = new StringBuilder();
        String subStr;
        String s;
        char letter = 'a';
        char leterTwo = 'b';


        for (int i = 0; i < message.length(); i++) {
//            subStr = message.substring(i, i+1);
//            s = (i % 2 == 0) ? subStr.toUpperCase() : subStr.toLowerCase();
//            sb.append(s);
            letter = message.charAt(i);
            leterTwo = (i % 2 == 0) ? Character.toUpperCase(letter) : Character.toLowerCase(letter);
            sb.append(leterTwo);
        }
        System.out.println(sb);
    }
}
