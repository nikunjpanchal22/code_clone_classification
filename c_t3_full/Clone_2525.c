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
    unsigned long long first_value, second_value;
    first_value = argc > 1 ? strtoul(argv[1], NULL, 10) : 0;
    printf("Lower limit:");
    if(first_value == 0) scanf("%llu", &first_value);
    
    second_value= argc > 2 ? strtoul(argv[2], NULL, 10) : 0;
    printf("Upper limit:");
    if(second_value == 0) scanf("%llu", &second_value);

    for(unsigned long long num = first_value; num <= second_value; num++){
        printf("%llu\n", num);
    }
    return 0;
}


