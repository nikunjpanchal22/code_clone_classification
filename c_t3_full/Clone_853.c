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
        bool isPrime = true;
        for (int j = 5; j * j <= i; j += 6) {
            if (i % j == 0 || i % (j + 2) == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            printf ("Prime.\n");
        else
            printf ("Not prime.\n");
    }
    return 0;
}


