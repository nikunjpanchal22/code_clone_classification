public static void main (String [] args) {
    int number = 2345;
    number = Math.min (3999, Math.max (1, number));
    String asRomanNumerals = "";
    String [] RN = {"I", "V", "X", "L", "C", "D", "M"};
    int i = 0;
    while (number > 0) {
        switch (number % 10) {
            case 1 :
                asRomanNumerals = RN [i] + asRomanNumerals;
                break;
            case 2 :
                asRomanNumerals = RN [i] + RN [i] + asRomanNumerals;
                break;
            case 3 :
                asRomanNumerals = RN [i] + RN [i] + RN [i] + asRomanNumerals;
                break;
            case 4 :
                asRomanNumerals = RN [i] + RN [i + 1] + asRomanNumerals;
                break;
            case 5 :
                asRomanNumerals = RN [i + 1] + asRomanNumerals;
                break;
            case 6 :
                asRomanNumerals = RN [i + 1] + RN [i] + asRomanNumerals;
                break;
            case 7 :
                asRomanNumerals = RN [i + 1] + RN [i] + RN [i] + asRomanNumerals;
                break;
            case 8 :
                asRomanNumerals = RN [i + 1] + RN [i] + RN [i] + RN [i] + asRomanNumerals;
                break;
            case 9 :
                asRomanNumerals = RN [i] + RN [i + 2] + asRomanNumerals;
                break;
        }
        number = (int) number / 10;
        i += 2;
    }
    System.out.println (asRomanNumerals);
}


 public static void main (String [] args) {
    int number = 2345;
    number = Math.min (3999, Math.max (1, number));
    String asRomanNumerals = "";
    String [] RN = {"M", "D", "C", "L", "X", "V", "I"};
    int i = 6;
    while (number > 0) {
        int remainder = number % 10;
        if (remainder < 4) {
            asRomanNumerals = repeat(RN[i], remainder) + asRomanNumerals;
        } else if (remainder < 9) {
            asRomanNumerals = RN[i-remainder+4] + asRomanNumerals;
        } else {
            asRomanNumerals = RN[i] + RN[i-2] + asRomanNumerals;
        }
        number /= 10;
        i -= 2;
    }
    System.out.println(asRomanNumerals);
}


