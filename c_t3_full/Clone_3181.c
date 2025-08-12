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
    int a, i;
    char z[10];
    printf("Enter number of characters: ");
    scanf("%d", &a);
    for(i = 0; i < a; i++) {
        printf("Enter character #%d: ", i+1);
        scanf(" %c", &z[i]);
    }
    printf("You entered the characters: ");
    for(i = 0; i < a; i++) {
        printf("%c ", z[i]);
    }
    return 0;
    
}


