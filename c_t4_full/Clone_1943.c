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
    if(number < 2) return 0;
    if(number % 2 == 0) return number == 2;
    for(int i = 3; i <= sqrt(number); i += 2) {
        if(number % i == 0) return 0;
    }
    return 1;
}


