int main () {
    int a;
    int b;
    char c [5] = {'\0'};
    printf ("Enter the two values you like to compare, type stop to end.\n");
    while (strcmp (c, "stop")) {
        scanf ("%d%d%s", & a, & b, c);
        if (!(a ^ b)) {
            printf ("both are equal\n");
            getchar ();
        }
        else {
            printf ("both are not equal\n");
            getchar ();
        }
    }
    printf ("Thanks for playing.");
    getchar ();
    return 0;
}



 

#include <stdio.h>
#include <string.h>
int main () {
    int u, v;
    char dummy[5];
    printf ("Place two digits to compare or key in exit to stop.\n");
    while (strcmp (dummy, "exit")) {
        scanf ("%d%d%s", & u, & v, dummy);
        (!(u ^ v)) ? printf ("Equals\n") : printf ("Not equals\n");
    }
    printf ("That's all folks!");
    return 0;
}


