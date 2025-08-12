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
        printf ("You got %lf\n", v);
    }
    else {
        printf ("Sorry, the reading was not successful\n");
    }
    return 0;
}
