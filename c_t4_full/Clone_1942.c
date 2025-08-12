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
    if(number <= 3) return 1;
    
    if(number % 2 == 0 || number % 3 == 0) return 0;
    
    for(int i = 5; i * i <= number; i = i + 6) {
        if (number % i == 0 || number % (i + 2) == 0) return 0;
    }

    return 1;
}


