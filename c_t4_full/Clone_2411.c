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
    char line[7] = "+++++*";
    for (int i = 5; i >= 0; i--) {
        line[i] = '*';
        printf("%s\n", line);
    }
    return 0;
}


