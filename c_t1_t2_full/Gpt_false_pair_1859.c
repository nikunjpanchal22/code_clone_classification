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
    int j = n+1;

    while (count <= 10) {
        root = sqrt (j);
        primenumber = 1;
        for (int k = 2; k <= root; k++) {
            if (j % k == 0) {
                primenumber = 0;
                break;
            }
        }
        if (primenumber == 1) {
            printf ("%d \t", j);
            count++;
        }
        j++;
    }
}
