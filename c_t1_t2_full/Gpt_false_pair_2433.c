int main () {
    double complex z1 = 1.0 + 3.0 * I;
    double complex z2 = 1.0 - 4.0 * I;
    printf ("Working with complex numbers:\n\v");
    printf ("Starting values: Z1 = %.2f + %.2fi\tZ2 = %.2f %+.2fi\n", creal (z1), cimag (z1), creal (z2), cimag (z2));
    double complex sum = z1 + z2;
    printf ("The sum: Z1 + Z2 = %.2f %+.2fi\n", creal (sum), cimag (sum));
    double complex difference = z1 - z2;
    printf ("The difference: Z1 - Z2 = %.2f %+.2fi\n", creal (difference), cimag (difference));
    double complex product = z1 * z2;
    printf ("The product: Z1 x Z2 = %.2f %+.2fi\n", creal (product), cimag (product));
    double complex quotient = z1 / z2;
    printf ("The quotient: Z1 / Z2 = %.2f %+.2fi\n", creal (quotient), cimag (quotient));
    double complex conjugate = conj (z1);
    printf ("The conjugate of Z1 = %.2f %+.2fi\n", creal (conjugate), cimag (conjugate));
    return 0;
}


int main () {
    double complex z1 = 1.0 + 3.0 * I;
    double complex z2 = 1.0 - 4.0 * I;
    printf ("Working on complex numbers:\n\v");
    printf ("Original values: Z1 = %.2f + %.2fi\tZ2 = %.2f %+.2fi\n", creal (z1), cimag (z1), creal (z2), cimag (z2));
    double complex sum = z1 + z2;
    printf ("Adding together: Z1 + Z2 = %.2f %+.2fi\n", creal (sum), cimag (sum));
    double complex difference = z1 - z2;
    printf ("Subtracting: Z1 - Z2 = %.2f %+.2fi\n", creal (difference), cimag (difference));
    double complex product = z1 * z2;
    printf ("Multiplied: Z1 x Z2 = %.2f %+.2fi\n", creal (product), cimag (product));
    double complex quotient = z1 / z2;
    printf ("Divided: Z1 / Z2 = %.2f %+.2fi\n", creal (quotient), cimag (quotient));
    double complex conjugate = conj (z1);
    printf ("Conjugate of Z1 = %.2f %+.2fi\n", creal (conjugate), cimag (conjugate));
    return 0;
}
