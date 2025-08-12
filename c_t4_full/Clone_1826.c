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
    int g, h;
    char script[5];
    printf ("Provide two numbers to compare or use quit to stop.\n");
    while (strcmp (script, "quit")) {
        scanf ("%d%d%s", & g, & h, script);
        (!(g ^ h)) ? printf ("Equal\n") : printf ("Not equal\n");
    }
    printf ("Program ended");
    return 0;
}


