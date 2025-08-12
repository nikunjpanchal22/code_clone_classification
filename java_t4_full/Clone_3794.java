public static void main (String [] args) {
    String test = "The quick brown fox jumped over the lazy dog.";
    int countA = 0, countO = 0, countSpace = 0, countDot = 0;
    for (int i = 0;
    i < test.length (); i ++) {
        switch (test.charAt (i)) {
            case 'a' :
            case 'A' :
                countA ++;
                break;
            case 'o' :
            case 'O' :
                countO ++;
                break;
            case ' ' :
                countSpace ++;
                break;
            case '.' :
                countDot ++;
                break;
        }
    }
    System.out.printf ("%s%d%n%s%d%n%s%d%n%s%d", "A: ", countA, "O: ", countO, "Space: ", countSpace, "Dot: ", countDot);
}





public class Main{
    public static void main(String[] args){
        String s = "The quick brown fox jumped over the lazy dog.";
        printCounts(countLetters(s));
    }

    static int[] countLetters(String s){
        int[] counters = new int[128];
        s.chars().forEach(c -> counters[c]++);
        return counters;
    }

    static void printCounts(int[] counters){
        System.out.printf ("%s%d%n%s%d%n%s%d%n%s%d", "A: ", counters['A']+counters['a'], "O: ", counters['O']+counters['o'], "Space: ", counters[' '], "Dot: ", counters['.']);
    }
}


