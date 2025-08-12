int main () {
    double v;
    int err;
    err = scanf ("%lf", &v);
    if (1 == err) {
        printf ("%lf\n", v);
    }
    else {
        printf ("read failed\n");
    }
    return 0;
}


  int main () {
    double v;
    int err;
    err = scanf ("%lf", &v);
    if (1 == err) {
        printf ("The double you entered was %lf\n", v);
    }
    else {
        printf ("There was an issue reading the double\n");
    }
    return 0;
}
