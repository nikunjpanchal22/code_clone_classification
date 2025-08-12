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
    int i;
    int a;
    char ch[10];
    printf ("Enter a number: ");
    scanf ("%d", &a);
    while ((i=getchar()) != '\n' && i!= EOF) {}
    for (i = 0; i < a; i++) {
        printf ("Enter a character: ");
        scanf ("%c", &ch[i]);
        if (ch[i] == '\n' || ch[i] == EOF) --i;
        else while ((i=getchar()) != '\n' && i!= EOF) {}
    }
    printf ("\nEntered characters are: ");
    for (i = 0; i < a; i++) {
        printf ("%c ", ch[i]);
    }
    return 0;
}


