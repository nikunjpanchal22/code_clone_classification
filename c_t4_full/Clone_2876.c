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
    fgets(&var, sizeof(var), stdin);
    (var > 5)?printf ("var > 5\n"):printf ("var <= 5\n");
    return 0;
}


