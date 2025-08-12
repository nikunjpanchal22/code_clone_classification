int main (void) {
    int number;
    printf ("Enter an integer: ");
    if (scanf ("%d", &number) == 1) {
        printf ("You entered: %d\n", number);
    }
    else {
        puts ("Invalid input");
    }
    return 0;
}


int main (void) {
    int enteredNumber;
    printf ("Type an integer: ");
    if (scanf ("%d", &enteredNumber) == 1) {
        printf ("The entered value is: %d\n", enteredNumber);
    }
    else {
        puts ("Input not accepted.");
    }
    return 0;
}
