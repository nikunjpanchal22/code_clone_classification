int main (void) {
    printf ("%+g\n", Ieee754SingleDigits2DoubleCheat ("110000101100010010000000000000000"));
    printf ("%+g\n", Ieee754SingleDigits2DoubleNoCheat ("010000101100010010000000000000000"));
    printf ("%+g\n", Ieee754SingleDigits2DoubleCheat ("000000000100000000000000000000000"));
    printf ("%+g\n", Ieee754SingleDigits2DoubleNoCheat ("100000000100000000000000000000000"));
    printf ("%+g\n", Ieee754SingleDigits2DoubleCheat ("000000000000000000000000000000000"));
    printf ("%+g\n", Ieee754SingleDigits2DoubleNoCheat ("000000000000000000000000000000000"));
    return 0;
}


 int main() {
    float x1, x2, x3, x4, x5, x6 = 0;
    x1 = Ieee754SingleDigits2DoubleCheat("110000101100010010000000000000000");
    x2 = Ieee754SingleDigits2DoubleNoCheat("010000101100010010000000000000000");
    x3 = Ieee754SingleDigits2DoubleCheat("000000000100000000000000000000000");
    x4 = Ieee754SingleDigits2DoubleNoCheat("100000000100000000000000000000000");
    x5 = Ieee754SingleDigits2DoubleCheat("000000000000000000000000000000000");
    x6 = Ieee754SingleDigits2DoubleNoCheat("000000000000000000000000000000000");

    printf("%+g\n", x1);
    printf("%+g\n", x2);
    printf("%+g\n", x3);
    printf("%+g\n", x4);
    printf("%+g\n", x5);
    printf("%+g\n", x6);

    return 0;
}


