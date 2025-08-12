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
    double complex q = 1./ 4.* M_PI + 1./ 4.* M_PI * I;
    double complex r, s, t, u;
    r = exp (q);
    s = sin (q);
    t = sqrt (q);
    u = log (q);
    printf ("exp(q)=%lf + %lf I\n", creal (r), cimag (r));
    printf ("sin(q)=%lf + %lf I\n", creal (s), cimag (s));
    printf ("sqrt(q)=%lf + %lf I\n", creal (t), cimag (t));
    printf ("log(q)=%lf + %lf I\n", creal (u), cimag (u));
    return 0;
}
