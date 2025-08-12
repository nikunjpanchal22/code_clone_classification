public static void main (String [] args) {
    System.out.println ("*** " + FrenchNumberToWords.convert (0));
    System.out.println ("*** " + FrenchNumberToWords.convert (9));
    System.out.println ("*** " + FrenchNumberToWords.convert (19));
    System.out.println ("*** " + FrenchNumberToWords.convert (21));
    System.out.println ("*** " + FrenchNumberToWords.convert (28));
    System.out.println ("*** " + FrenchNumberToWords.convert (71));
    System.out.println ("*** " + FrenchNumberToWords.convert (72));
    System.out.println ("*** " + FrenchNumberToWords.convert (80));
    System.out.println ("*** " + FrenchNumberToWords.convert (81));
    System.out.println ("*** " + FrenchNumberToWords.convert (89));
    System.out.println ("*** " + FrenchNumberToWords.convert (90));
    System.out.println ("*** " + FrenchNumberToWords.convert (91));
    System.out.println ("*** " + FrenchNumberToWords.convert (97));
    System.out.println ("*** " + FrenchNumberToWords.convert (100));
    System.out.println ("*** " + FrenchNumberToWords.convert (101));
    System.out.println ("*** " + FrenchNumberToWords.convert (110));
    System.out.println ("*** " + FrenchNumberToWords.convert (120));
    System.out.println ("*** " + FrenchNumberToWords.convert (200));
    System.out.println ("*** " + FrenchNumberToWords.convert (201));
    System.out.println ("*** " + FrenchNumberToWords.convert (232));
    System.out.println ("*** " + FrenchNumberToWords.convert (999));
    System.out.println ("*** " + FrenchNumberToWords.convert (1000));
    System.out.println ("*** " + FrenchNumberToWords.convert (1001));
    System.out.println ("*** " + FrenchNumberToWords.convert (10000));
    System.out.println ("*** " + FrenchNumberToWords.convert (10001));
    System.out.println ("*** " + FrenchNumberToWords.convert (100000));
    System.out.println ("*** " + FrenchNumberToWords.convert (2000000));
    System.out.println ("*** " + FrenchNumberToWords.convert (3000000000L));
    System.out.println ("*** " + FrenchNumberToWords.convert (2147483647));
}



public static void main (String [] args) {
    Set<Integer> numbers = new HashSet<>(Arrays.asList(0,9,19,21,28,71,72,80,81,89,90,91,97,100,101,110,120,200,201,232,999,1000,1001,10000,10001,100000,2000000,3000000000,2147483647));
    numbers.forEach(num -> System.out.println ("*** " + FrenchNumberToWords.convert (num)));
}


