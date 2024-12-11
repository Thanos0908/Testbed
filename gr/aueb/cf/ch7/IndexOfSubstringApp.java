package gr.aueb.cf.ch7;

public class IndexOfSubstringApp {
    String cf = "Coding Factory";

    int positionOfo = cf.indexOf("o"); //1
    int positionOfSecondo = cf.indexOf("o", 2);
    int lastPositionOfo = cf.lastIndexOf("o");

    String cf2 = cf.substring(1); // "oding Factory"
    String cf3 = cf.substring(1, 3); // od
}
