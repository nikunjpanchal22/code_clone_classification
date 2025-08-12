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
    int data;
    printf ("Input a number: ");
    if (scanf ("%d", &data) == 1) {
        printf ("You entered: %d\n", data);
    }
    else {
        puts ("Incorrect input");
    }
    return 0;
}
