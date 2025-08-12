public static void main (String arg []) {
    Integer [] v1 = {1, - 10, 3, 9, 7, 99, - 25};
    Integer [] v2 = {1, - 10, 3, 9, 7, 99, - 25};
    double p_int = ArrayMath.ScalarProduct (v1, v2);
    Double [] v1_d = {1.1, - 10.5, 3.7, 9.98, 7.4, 9.9, - 2.5};
    Double [] v2_d = {1.1, - 10.5, 3.7, 9.98, 7.4, 9.9, - 2.5};
    Double p_double = ArrayMath.ScalarProduct (v1_d, v2_d);
    System.out.println ("p_int:" + p_int);
    System.out.println ("p_double:" + p_double);
}


 
public static void main (String[] args) {
    int[] v1 = new int[7];
    v1[0] = 1; v1[1] = -10; v1[2] = 3;
    v1[3] = 9; v1[4] = 7; v1[5] = 99;
    v1[6] = -25;
    int[] v2 = new int[7];
    v2[0] = 1; v2[1] = -10; v2[2] = 3;
    v2[3] = 9; v2[4] = 7; v2[5] = 99;
    v2[6] = -25;
    int p_int = ArrayMath.scalarProduct(v1, v2); 
    double[] v1_d = new double[7];
    v1_d[0] = 1.1; v1_d[1] = -10.5; v1_d[2] = 3.7;
    v1_d[3] = 9.98; v1_d[4] = 7.4; v1_d[5] = 9.9;
    v1_d[6] = -2.5;
    double[] v2_d = new double[7];
    v2_d[0] = 1.1; v2_d[1] = -10.5; v2_d[2] = 3.7;
    v2_d[3] = 9.98; v2_d[4] = 7.4; v2_d[5] = 9.9;
    v2_d[6] = -2.5;
    double p_double = ArrayMath.ScalarProduct(v1_d, v2_d);
    System.out.println("p_int:" + p_int);
    System.out.println("p_double:" + p_double);
}


