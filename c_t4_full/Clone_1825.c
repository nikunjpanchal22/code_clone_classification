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
    int i, j;
    char str [6];
    puts ("Give two numbers or type break to stop");
    while (strcmp (str, "break")) {
        scanf ("%d%d%s", & i, & j, str);
        (!(i ^ j)) ? puts("Equals\n"):puts("Not equals\n");
    }
    puts ("Thanks for your time");
    return 0;
}


