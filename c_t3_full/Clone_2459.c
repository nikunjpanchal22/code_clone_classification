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
    long int N = 0;
    if (argc > 1) {
        N = atoi(argv[1]);
    }
    if (N >= 1) {
        printf("Listing 1 to %ld using atoi\n", N);
    }
    else {
        printf("Enter a postive N\n");
    }
}


