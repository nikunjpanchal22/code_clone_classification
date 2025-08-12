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




#include <stdio.h>
#include <complex.h>

int main () {
    double complex z1 = 1.0 + 3.0 * I, z2 = 1.0 - 4.0 * I;
    double complex sum = z1 + z2, difference = z1 - z2;
    double complex product = z1 * z2, quotient = z1 / z2, conjugate = conj (z1);

    printf ("Z1 = %.2f + %.2fi  Z2 = %.2f %+.2fi\nSum = %.2f %+.2fi  Difference = %.2f %+.2fi\nProduct = %.2f %+.2fi  Quotient = %.2f %+.2fi\nConjugate = %.2f %+.2fi\n",
            creal (z1), cimag (z1), creal (z2), cimag (z2), creal (sum), cimag (sum), creal (difference), cimag (difference), creal (product), cimag (product), creal (quotient), cimag (quotient), creal (conjugate), cimag (conjugate));
    return 0;
}


