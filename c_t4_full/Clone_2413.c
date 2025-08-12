int main () {
    for (int i = 0; i < 6; i++) {
        for (int k = i; k < 5; k++) {
            printf ("+");
        }
        for (int j = 0; j < i; j++) {
            printf ("*");
        }
        printf ("\n");
    }
    return 0;
}



 

#include<stdio.h>
int main () {
    int count = 6;
    while(count--) {
        printf("%.*s%.*s\n", count, "+++++", 5-count, "*****");
    }
    return 0;
}


