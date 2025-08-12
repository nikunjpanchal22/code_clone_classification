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





public static void main(String[] args){
            String s = "The quick brown fox jumped over the lazy dog.";
            int countA = countChar(s, 'a') + countChar(s, 'A');
            int countO = countChar(s, 'o') + countChar(s, 'O');
            int countSpace = countChar(s, ' ');
            int countDot = countChar(s, '.');

            System.out.printf ("%s%d%n%s%d%n%s%d%n%s%d", "A: ", countA, "O: ", countO, "Space: ", countSpace, "Dot: ", countDot);
        }

        public static int countChar(String s, char c) {
            int count = 0;
            for(char _c : s.toCharArray())
                if(_c == c)
                    count++;
            return count;
}


