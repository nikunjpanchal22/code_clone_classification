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



 

int test_prime(int number) {
    if(number <= 1) return 0;
    int m = sqrt(number);
    for(int i = 2; i <= m; i++)
        if(number % i == 0) return 0;
    return 1;
}


