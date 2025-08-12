int main () {
    int n, i, count = 1, primenumber = 1, root;
    printf ("Insert a number:\n");
    scanf ("%d", & n);
    n++;
    while (count != 11) {
        root = sqrt (n);
        primenumber = 1;
        for (i = 2; i <= root; i++) {
            if (n % i == 0) {
                primenumber = 0;
                break;
            }
        }
        if (primenumber == 1) {
            printf ("%d \t", n);
            count++;
        }
        n++;
    }
}


  int main () {
    int n, i, count = 1, primenumber = 1, root;
    printf ("Insert a number:\n");
    scanf ("%d", & n);
    n++;
    for (int i=n; i< n+10; i++){
        root = sqrt (i);
        primenumber = 1;
        for (int j = 2; j <= root; j++) {
            if (i % j == 0) {
                primenumber = 0;
                break;
            }
        }
        if (primenumber == 1) {
            printf ("%d \t", i);
            count++;
        }
    }
}
