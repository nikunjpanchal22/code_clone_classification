public static void main (String [] args) {
    String s1 = "Cat";
    String s2 = "Cat";
    String s3 = new String ("Cat");
    if (s1 == s2) {
        System.out.println ("true");
    } else {
        System.out.println ("false");
    }
    if (s1 == s3) {
        System.out.println ("true");
    } else {
        System.out.println ("false");
    }
    if (s1.equals (s3)) {
        System.out.println ("true");
    } else {
        System.out.println ("False");
    }
}



 

public static void main (String [] args) {
    String s1 = "Hotel";
    String s2 = "Cafe";
    String s3 = new String ("Hotel");

    System.out.println(s1 == s2);
    System.out.println(s1 == s3);
    System.out.println(s1.equals(s3));
}


