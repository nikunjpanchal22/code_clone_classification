int main (void) {
    int i;
    double num [10];
    for (i = 1; i <= 10; i++) {
        printf ("Enter a number: ");
        if (scanf ("%lf", &num[i - 1]) != 1) {
            puts ("read error");
            return 1;
        }
    }
    return 0; 
}


  int main (void) {
    int i;
    double num [10];
    i = 0;
    while (i < 10) {
        printf ("Enter a number: ");
        int rc = scanf ("%lf", &num[i]);
        if (rc == 0) {
            puts ("read error");
            return 1;
        }
        else if (rc == 1)
            i++;
    }
    return 0; 
}


