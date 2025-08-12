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
        int result = 1;
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                result = 0;
            }
        }
        if (result)
            printf ("Prime.\n");
        else
            printf ("Not prime.\n");
    }
    return 0;
}


