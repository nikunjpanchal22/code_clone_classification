public static void main (String arg []) {
    Integer [] v1 = {1, - 10, 3, 9, 7, 99, - 25};
    Integer [] v2 = {1, - 10, 3, 9, 7, 99, - 25};
    double p_int = ArrayMath.ScalarProduct (v1, v2);
    Double [] v1_d = {1.1, - 10.5, 3.7, 9.98, 7.4, 9.9, - 2.5};
    Double [] v2_d = {1.1, - 10.5, 3.7, 9.98, 7.4, 9.9, - 2.5};
    Double p_double = ArrayMath.ScalarProduct (v1_d, v2_d);
    System.out.println ("p_int：" + p_int);
    System.out.println ("p_double：" + p_double);
}


 
public static void main (String arg []) {
    Integer [] v1 = {1, - 10, 3, 9, 7, 99, - 25};
    Integer [] v2 = {1, - 10, 3, 9, 7, 99, - 25};
    int p_int = ArrayMath.ScalarProductRows(v1, v2);
    Double [] v1_d = {1.1, - 10.5, 3.7, 9.98, 7.4, 9.9, - 2.5};
    Double [] v2_d = {1.1, - 10.5, 3.7, 9.98, 7.4, 9.9, - 2.5};
    double p_double = ArrayMath.ScalarProductRows(v1_d, v2_d);
    System.out.println ("p_int：" + p_int);
    System.out.println ("p_double：" + p_double);
}
