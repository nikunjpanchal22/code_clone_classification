int main (void) {
    printf ("%+g\n", Ieee754SingleDigits2DoubleCheat ("110000101100010010000000000000000"));
    printf ("%+g\n", Ieee754SingleDigits2DoubleNoCheat ("010000101100010010000000000000000"));
    printf ("%+g\n", Ieee754SingleDigits2DoubleCheat ("000000000100000000000000000000000"));
    printf ("%+g\n", Ieee754SingleDigits2DoubleNoCheat ("100000000100000000000000000000000"));
    printf ("%+g\n", Ieee754SingleDigits2DoubleCheat ("000000000000000000000000000000000"));
    printf ("%+g\n", Ieee754SingleDigits2DoubleNoCheat ("000000000000000000000000000000000"));
    return 0;
}


 int main(void) {
    double j1 = GenerateDoubleFromSingleBinaryCheat("110000101100010010000000000000000");
    double j2 = GenerateDoubleFromSingleBinaryNoCheat("010000101100010010000000000000000");
    double j3 = GenerateDoubleFromSingleBinaryCheat("000000000100000000000000000000000");
    double j4 = GenerateDoubleFromSingleBinaryNoCheat("100000000100000000000000000000000");
    double j5 = GenerateDoubleFromSingleBinaryCheat("000000000000000000000000000000000");
    double j6 = GenerateDoubleFromSingleBinaryNoCheat("000000000000000000000000000000000");

    printf("%+g\n", j1);
    printf("%+g\n", j2);
    printf("%+g\n", j3);
    printf("%+g\n", j4);
    printf("%+g\n", j5);
    printf("%+g\n", j6);

    return 0;
}


