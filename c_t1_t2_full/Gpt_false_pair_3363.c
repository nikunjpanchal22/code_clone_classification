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
    int num;
    printf ("Give a number: ");
    if (scanf ("%d", &num) == 1) {
        printf ("You submitted: %d\n", num);
    }
    else {
        puts ("Invalid input");
    }
    return 0;
}
