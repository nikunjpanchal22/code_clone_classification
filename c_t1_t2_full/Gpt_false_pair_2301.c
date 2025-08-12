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
    double complex u = 1./ 4.* M_PI + 1./ 4.* M_PI * I;
    double complex v, w, x, y;
    v = exp (u);
    w = sin (u);
    x = sqrt (u);
    y = log (u);
    printf ("exp(u)=%lf + %lf I\n", creal (v), cimag (v));
    printf ("sin(u)=%lf + %lf I\n", creal (w), cimag (w));
    printf ("sqrt(u)=%lf + %lf I\n", creal (x), cimag (x));
    printf ("log(u)=%lf + %lf I\n", creal (y), cimag (y));
    return 0;
}
