int main (void) {
    int i;
    printf ("Enter a number: ");
    scanf ("%d", & i);
    if (isdigit (i)) {
        printf ("It is a digit.");
    }
    else {
        if (test_prime (i))
            printf ("Prime.\n");
        else
            printf ("Not prime.\n");
    }
    return 0;
}


 int main (void) {
    int i;
    printf ("Enter a number: ");
    scanf ("%d", & i);
    if (isdigit (i)) {
        printf ("It is a digit.");
    }
    else {
        bool is_prime = true;
        int upper_limit = (int) sqrt (i);
        for (int j = 2; j <= upper_limit; j++) {
            if (i % j == 0) {
                is_prime = false;
                break;
            }
        }
        if (is_prime)
            printf ("Prime.\n");
        else
            printf ("Not prime.\n");
    }
    return 0;
}


