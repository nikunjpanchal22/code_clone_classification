int main (int argc, char *argv []) {
    long a, b;
    if (argc > 2) {
        a = strtol (argv[1], NULL, 0);
        b = strtol (argv[2], NULL, 0);
        printf ("%ld %ld", a, b);
    }
    return 0;
}





#include<stdio.h>
#include<stdlib.h>

void process_args(long *a, long *b, char *str1, char *str2){
            *a = strtol(str1, NULL, 0);
            *b = strtol(str2, NULL, 0);
        }

        int main(int argc, char *argv[]){
            long a, b;

            if(argc > 2){
                process_args(&a, &b, argv[1], argv[2]);
                printf("%ld %ld", a, b);
            }

            return 0;
}


