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
    int p, q;
    char s[5];
    printf ("Give me two digits for comparison or type quit to stop.\n");
    while (strcmp (s, "quit")) {
        scanf ("%d%d%s", & p, & q, s);
        (!(p ^ q)) ? printf ("Match\n") : printf ("No Match\n");
    }
    printf ("Thank you");
    return 0;
}


