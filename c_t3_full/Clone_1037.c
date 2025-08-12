int main (void) {
    unsigned int a [N];
    printf ("Enter %zu numbers: ", (size_t) N);
    for (size_t i = 0; i < N; i++) {
        scanf ("%u", & a [i]);
    }
    printf ("Prime numbers are: ");
    for (size_t i = 0; i < N; i++) {
        int prime = a[i] == 2 || a[i] % 2 == 1 && a[i] != 1;
        for (unsigned int j = 3; prime && j <= a[i] / j; j += 2) {
            prime = a[i] % j != 0;
        }
        if (prime)
            printf ("%u, ", a[i]);
    }
    putchar ('\n');
    return 0;
}



 
int main (void) {
    unsigned int a[N];
    printf ("Enter %zu numbers: ", (size_t)N);
    for (size_t i = 0; i < N; i++) {
        scanf ("%u", &a[i]);
    }
    printf ("Prime numbers are: ");
    for (size_t i = 0; i < N; i++) {
       int isPrime = 0;
       if (a[i] == 2 || (a[i] != 1 && a[i] % 2 != 0)) {
          for (int j = 3; j <= a[i]/2; j += 2) {
             if (a[i] % j == 0) {
                isPrime = 0; 
                break;
             }
             isPrime = 1;
          }
       }
       if (isPrime)
          printf ("%u, ", a[i]);
    }
    putchar ('\n');
    return 0;
}


