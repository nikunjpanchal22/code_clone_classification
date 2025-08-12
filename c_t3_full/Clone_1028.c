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


 
int main(void) {
    unsigned int a[N];
    printf ("Enter %zu numbers: ", (size_t) N);
    for (size_t i = 0; i < N; i++) {
        scanf ("%u", &a[i]);
    }
    printf ("Prime numbers are: ");
    for (size_t i = 0; i < N; i++) {
       int isPrime = 0;
       if (a[i] == 2)
          isPrime = 1;
       else if (a[i] % 2 != 0 && a[i] != 1) {
          int f;
          for (f = 3; f <= a[i] / 3; f += 2) {
             if (a[i] % f == 0)
                break;
          }
          if (f >= a[i]/3)
             isPrime = 1;
       }
       if (isPrime)
          printf ("%u, ", a[i]);
    }
    putchar ('\n');
    return 0;
}


