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
    const char *plus = "+++++";
    const char *star = "*****";
    for (int i = 0; i < 6; i++) {
        fwrite(plus, 1, 5 - i, stdout);
        fwrite(star, 1, i, stdout);
        fwrite("\n", 1, 1, stdout);
    }
    return 0;
}


