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
    long [] numbers = {0L,9L,19L,21L,28L,71L,72L,80L,81L,89L,90L,91L,97L,100L,101L,110L,120L,200L,201L,232L,999L,1000L,1001L,10000L,10001L,100000L,2000000L,3000000000L,2147483647L};
    LongStream.of(numbers).forEach(num -> System.out.println ("*** " + FrenchNumberToWords.convert (num)));
}


