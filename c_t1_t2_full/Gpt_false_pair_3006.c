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


int main(void) {
    int i;
    printf ("Enter a number: ");
    scanf ("%d", &i);
    if (isdigit (i)) {
        printf ("It is a digit.");
    } else {
        int prime = test_prime(i);
        if (prime == 1)
            printf ("Prime.\n");
        else if (prime == 0)
            printf ("Not prime.\n");
    }
    return 0;
}
