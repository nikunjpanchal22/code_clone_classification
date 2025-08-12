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
    int n, i, count = 1, primenumber, root;
    printf ("Insert a number:\n");
    scanf ("%d", & n);
    int m = n+1;

    while (count <= 10) {
        root = sqrt (m);
        primenumber = 1;
        for (int j = root; j > 0; j--){
            if (m % j == 0) {
                primenumber = 0;
                break;
            }
        }
        if (primenumber == 1) {
            printf ("%d \t", m);
            count++;
        }
        m++;
    }
}
