int main () {
    char key [] = "april", ckey [6];
    printf ("Enter the key: ");
    scanf (" %5s", ckey);
    if (!strcmp (ckey, key)) {
        printf ("Correct.");
    }
    else {
        printf ("Wrong.");
    }
    return 0;
}




#include<stdio.h>
#include<string.h>
int main() {
    char *key = "april", ckey[6];
    printf ("Enter the key: ");
    scanf (" %5s", ckey);
    !strcmp (ckey, key) ? puts ("Correct.") : puts ("Wrong.");
    return 0;
}


