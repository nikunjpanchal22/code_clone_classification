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



 

int main () {
    int a[N];
    printf ("Enter %d numbers: ",N);
    for (int i = 0; i < N; ++i) {
        scanf ("%u", &a[i]);
    }
    printf ("Prime numbers are: ");
    for (int i = 0; i < N; i++) {
        int flag = 1;
        if (a[i] <= 1) {
            flag = 0;
        }
        for (int j = 2; j * j <= a[i]; j++) {
            if (a[i] % j == 0){
                flag = 0;
                break;
            }
        }
        if (flag){
            printf ("%u, ", a[i]);
        }
    }
    printf ("\n");
    return 0;
}


