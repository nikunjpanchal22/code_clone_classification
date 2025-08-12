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
int main() {
    int i, a;
    char z[10];
    printf("Enter a number: ");
    scanf("%d", &a);
    while((getchar()) != '\n');
    for(i = 0; i < a; i++) {
        printf("Enter a character: ");
        scanf("%c", &z[i]);
        while((getchar()) != '\n');
    }
    printf("The entered characters are : ");
    for(i = 0; i < a; i++) {
        printf("%c\n", z[i]);
    }
    return 0;
}


