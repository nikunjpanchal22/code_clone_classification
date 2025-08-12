int main (int argc, char *argv []) {
    int i;
    if (argc > 1) {
        N = strtol (argv[1], NULL, 0);
    }
    if (N >= 1) {
        printf ("listing 1 to %d\n", N);
        print2147483648 (0);
    }
    else {
        printf ("Must enter a postive integer N\n");
    }
}



 

#include<stdio.h>
#include<stdlib.h>
int main (int argc, char *argv []) {
    long N =0;
    if (argc > 2) {
        N = strtol(argv[2], NULL, 0);
    }
    if (N >= 1) {
        printf("listing 1 to %ld\n", N);
    }
    else {
        printf("Enter N\n");
    }
}


