int main (void) {
    double complex z1 = 1./ 4.* M_PI + 1./ 4.* M_PI * I;
    double complex z2, z3, z4, z5;
    z2 = exp (z1);
    z3 = sin (z1);
    z4 = sqrt (z1);
    z5 = log (z1);
    printf ("exp(z1)=%lf + %lf I\n", creal (z2), cimag (z2));
    printf ("sin(z1)=%lf + %lf I\n", creal (z3), cimag (z3));
    printf ("sqrt(z1)=%lf + %lf I\n", creal (z4), cimag (z4));
    printf ("log(z1)=%lf + %lf I\n", creal (z5), cimag (z5));
    return 0;
}


 int main() {
    double complex x = 1./ 4.* M_PI + 1./ 4.* M_PI * I;
    double complex y, z, a, b;
    y = exp (x);
    z = sin (x);
    a = sqrt (x);
    b = log (x);
    printf ("exp(x)=%lf + %lf I\n", creal (y), cimag (y));
    printf ("sin(x)=%lf + %lf I\n", creal (z), cimag (z));
    printf ("sqrt(x)=%lf + %lf I\n", creal (a), cimag (a));
    printf ("log(x)=%lf + %lf I\n", creal (b), cimag (b));
    return 0;
}
