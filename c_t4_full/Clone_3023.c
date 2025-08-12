int main (void) {
    char one [30];
    char two [30];
    while (fgets (one, sizeof (one), stdin)) {
        int len = strlen (one);
        for (int i = 0; i < (len + 1); i++) {
            two[i] = one[i];
        }
        printf ("%s", two);
        break;
    }
    return EXIT_SUCCESS;
}





#include <stdio.h>

int main(){
    char first[30], second[30];
    if ( fgets (first, sizeof(first), stdin) != NULL ) {
        int i=0;
        while (first[i] != '\0') {
            second[i] = first[i];
            i++;
        }
        second[i] = '\0';
        puts(second); 
    }
    return 0;
}


