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
int main(int argc,char *argv[] ){
    unsigned long long lower, upper;
    if(argc == 1){
        printf("Enter the lower_limit: ");
        scanf("%llu",&lower);
        printf("Enter the upper_limit: ");
        scanf("%llu",&upper);
    }
    else{
        lower = atoi(argv[1]);
        upper = atoi(argv[2]);
    }
    for(unsigned long long i = lower; i<=upper; i++){
        printf(" %llu\n",i);
    }
    return 0;
}


