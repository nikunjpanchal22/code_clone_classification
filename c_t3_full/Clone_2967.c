int main () {
    int var;
    scanf ("%d", & var);
    if (var > 5)
        printf ("var > 5\n");
    else
        printf ("var <= 5\n");
    return 0;
}


 


#include <stdio.h>
int main () {
    int var;
    scanf ("%d", & var);
    switch(var > 5) {
        case 1:
            printf ("var > 5\n");
            break;
        default:
            printf ("var <= 5\n");
    }
    return 0;
}


