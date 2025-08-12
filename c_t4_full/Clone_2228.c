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




#define M 100
int main () {
    int arr[M];
    printf ("Enter %d numbers: ", M);
    for (int i = 0; i < M; i++) {
        scanf ("%u", &arr[i]);
    }
    printf ("Prime numbers are: ");
    for (int i = 0; i < M; i++) {
        int check=0;
        for (int j = 2; j <= arr[i] / 2; j++) {
            if (arr[i] % j == 0){
                check=1;
                break;
            }
        }
        if (check==0){
            printf ("%u, ", arr[i]);
        }
    }
    printf ("\n");
    return 0;
}


