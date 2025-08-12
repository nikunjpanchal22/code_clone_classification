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
    double num[10];
    for (i = 0; i < 10; i++) {
        int rc;
        do {
            printf ("Enter a number: ");
            rc = scanf ("%lf", &num[i]);
            if (rc == 0) {
                puts ("read error");
                return 1;
            }
        } while (rc != 1);
    }
    return 0; 
}


