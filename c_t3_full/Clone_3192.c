int main () {
    char *z;
    int a;
    printf ("enter the no.");
    scanf ("%d", & a);
    z = (char *) malloc (a);
    printf ("the entered no. is:%d\n", a);
    int i;
    for (i = 0; i < a; i++) {
        printf ("enter the letters:");
        scanf ("%c", z + i);
    }
    printf ("the entered letters are:");
    for (i = 0; i < a; i++) {
        printf ("%c\n", z);
    }
    return 0;
}


 

#include <stdio.h>
#include<stdlib.h>

int main () {
    char *str;
    int intNum;
    printf ("Enter your number: ");
    scanf ("%d", &intNum);
    str = (char *) calloc(intNum,sizeof(char));
    printf ("Your number is: %d\n", intNum);
    for (int m = 0; m < intNum; m++) {
        printf ("Enter letters: ");
        while ((getchar()) != '\n'); 
        scanf ("%c", str + m);
    }
    printf ("The letters are: ");
    for (int m = 0; m < intNum; m++) {
        printf ("%c ", *(str + m));
    }
    free(str);
    return 0;
}


