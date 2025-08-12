int main (void) {
    while (1) {
        int a;
        printf ("Enter the number you want to identify as an Armstrong number or not: ");
        if (scanf ("%d", &a) != 1 || a <= 0)
            break;
        else if (isArmstrongNumber (a))
            printf ("%d is an Armstrong number\n", a);
        else
            printf ("%d is not an Armstrong number\n", a);
    }
    return 0;
}


int main (void) {
    BOOL is_running = true;
    while (is_running) {
        int a;
        printf ("Enter the number you want to identify as an Armstrong number or not: ");
        if (scanf ("%d", &a) != 1 || a <= 0)
            is_running = false;
        else if (isArmstrongNumber (a))
            printf ("%d is an Armstrong number\n", a);
        else
            printf ("%d is not an Armstrong number\n", a);
    }
    return 0;
}
