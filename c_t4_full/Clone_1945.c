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





int test_prime(int n) {
    if(n != 2 && n % 2 == 0) return 0;

    for(int i = 3; i <= sqrt(n); i += 2) {
        if(n % i == 0) return 0;
    }

    return n > 1;
}


