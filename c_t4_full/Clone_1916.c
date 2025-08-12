int main (int argc, char *argv []) {
    unsigned long long n1, n2;
    if (argc > 1) {
        n1 = strtoull (argv[1], NULL, 0);
    }
    else {
        printf ("Enter the lower limit: ");
        scanf ("%llu", & n1);
    }
    if (argc > 2) {
        n2 = strtoull (argv[2], NULL, 0);
    }
    else {
        printf ("Enter the upper limit: ");
        scanf ("%llu", & n2);
    }
    for (unsigned long long n = n1; n <= n2; n++) {
        n = next_narcissistic (n, n2 +1);
        if (n == 0)
            break;
        printf ("%llu\n", n);
    }
    return 0;
}





#include <stdio.h>
#include <stdlib.h>
int main(int argc, char *argv[]){
    double n1=0, n2=0;
    n1 = (argc > 1) ? atof(argv[1]) : scanf("%lf", &n1);
    n2 = (argc > 2) ? atof(argv[2]) : scanf("%lf", &n2);
    printf("Product is: %.2f\n", n1 * n2);
    return 0;
}


