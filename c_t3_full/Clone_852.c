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
        int flag = 1; 
        for (int j = 3; j <= (int) sqrt (i); j += 2) {
            if (i % j == 0) {
                flag = 0;
                break;
            }
        }
        if (flag == 1)
            printf ("Prime.\n");
        else
            printf ("Not prime.\n");
    }
    return 0;
}


