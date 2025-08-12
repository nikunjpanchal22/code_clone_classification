int main () {
    int n, n_initial;
    double sum = 0.0, prefix = 1.0;
    printf ("enter the value for n:\n");
    scanf ("%d", & n);
    if (n < 1) {
        printf ("n must be > 0!\n");
        return 1;
    }
    n_initial = n;
    if (n % 2 == 0)
        prefix = -1.0;
    else
        prefix = 1.0;
    do {
        sum += prefix / (double) n;
        prefix *= -1.0;
        n--;
    }
    while (n > 0);
    printf ("The sum of the series over %d terms is: %lf\n", n_initial, sum);
    return 0;
}


 int main() {
    int n, n_initial;
    double sum = 0.0, prefix = 1.0;
    printf("enter the value for n:");
    scanf("%d", &n);
    if (n < 1) {
        printf("n must be > 0!");
        return 1;
    }
    n_initial = n;

    for (int i = 1; i <= n; i++) {
        if (i % 2 == 1) {
            prefix = 1.0 * (-1);
            int j = 1;
            while (j <= i) {
                sum += (1.0 * prefix) / j;
                j++;
                prefix *= (-1);
            }
        }
    }
    printf("The sum of the series over %d terms is: %lf\n", n_initial, sum);
    return 0;
}


