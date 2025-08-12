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
    double complex i = 1./ 4.* M_PI + 1./ 4.* M_PI * I;
    double complex j, k, l, m;
    j = exp (i);
    k = sin (i);
    l = sqrt (i);
    m = log (i);
    printf ("exp(i)=%lf + %lf I\n", creal (j), cimag (j));
    printf ("sin(i)=%lf + %lf I\n", creal (k), cimag (k));
    printf ("sqrt(i)=%lf + %lf I\n", creal (l), cimag (l));
    printf ("log(i)=%lf + %lf I\n", creal (m), cimag (m));
    return 0;
}
