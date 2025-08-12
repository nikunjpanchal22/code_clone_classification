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
    scanf ("%d", &var);
    printf("%s\n", (var > 5)?"var > 5":"var <= 5");
    return 0;
}


