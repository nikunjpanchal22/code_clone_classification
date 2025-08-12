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
    double complex b = 1./ 4.* M_PI + 1./ 4.* M_PI * I;
    double complex c, d, e, f;
    c = exp (b);
    d = sin (b);
    e = sqrt (b);
    f = log (b);
    printf ("exp(b)=%lf + %lf I\n", creal (c), cimag (c));
    printf ("sin(b)=%lf + %lf I\n", creal (d), cimag (d));
    printf ("sqrt(b)=%lf + %lf I\n", creal (e), cimag (e));
    printf ("log(b)=%lf + %lf I\n", creal (f), cimag (f));
    return 0;
}
