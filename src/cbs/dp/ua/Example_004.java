package cbs.dp.ua;


public class Example_004 {
    public static void main(String[] args) {

        int x = 79538;
        System.out.println(turnNumber(x));
    }

    static int turnNumber(int x) {
        String numb = String.valueOf(x);
        char [] numbs = numb.toCharArray();
        char [] turnNumbs = new char[numbs.length];
        for (int i=0; i<numbs.length; i++) {
            turnNumbs[(numbs.length-1)-i] = numbs[i];
        }
        numb = String.copyValueOf(turnNumbs);
        return Integer.parseInt(numb);
    }
}
