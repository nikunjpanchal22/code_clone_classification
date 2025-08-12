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
    int n, m;
    char cmd [5];
    printf ("Input two numbers for comparison, type exit to stop.\n");
    while (strcmp (cmd, "exit")) {
        scanf ("%d%d%s", & n, & m, cmd);
        (!(n ^ m)) ? printf ("Equal\n") : printf ("Unequal\n");
    }
    printf ("Done");
    return 0;
}


