int main () {
    char n = 'Y';
    while (n == 'Y') {
        printf ("Add Next Y/N: ");
        n = getc (stdin);
        getchar ();
    }
    printf ("n = %c", n);
}





#include <stdio.h>

int main() {
    char n = 'Y';
    while(n == 'Y'){
        printf("Add Next Y/N: ");
        scanf(" %c", &n);
    }
    printf("n = %c", n);
}


