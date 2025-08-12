int main () {
    char z [10];
    int a;
    printf ("enter the no.");
    scanf ("%d", & a);
    printf ("the entered no. is:%d\n", a);
    int i;
    for (i = 0; i < a; i++) {
        printf ("enter the letters:");
        scanf ("%c", & z [i]);
    }
    printf ("the entered letters are:");
    for (i = 0; i < a; i++) {
        printf ("%c\n", z [i]);
    }
    return 0;
}





#include <stdio.h>
int main () {
    char z[10];
    int a, i; 
    printf ("Please input the number: ");
    scanf ("%d", & a);
    getchar(); 
    for (i = 0; i < a; i++) {
        printf ("Please input letter number %d : ",i+1);
        scanf ("%c", & z[i]);
        getchar();
    }
    printf ("Letters inputted are: ");
    for (i = 0; i < a; i++) {
        printf ("%c", z[i]);
    }
    return 0;
}


