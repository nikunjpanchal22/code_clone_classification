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
    n++;

    for (int k=0; k<10; k++){
        primenumber = 1;
        root = sqrt (n);
        for (int l = 2; l <= root; l++) {
            if (n % l == 0) {
                primenumber = 0;
                break;
            }
        }

        if (primenumber == 1){
            printf ("%d \t", n);
            count++;
        }
        n++;
    }
}
