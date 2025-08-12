int main () {
    int i = 0;
    int j = 1;
    char key [6] = "april", ckey [6];
    printf ("Enter the key: ");
    scanf ("%s", ckey);
    for (i = 0; i < 6; i++) {
        if (ckey[i] != key[i])
            j = 0;
    }
    if (j == 1)
        printf (% s, "Correct.")
    else
        printf (% s, "Wrong.")
    return 0;
}



 

#include <stdio.h>
#include <string.h>
int main () {
    char key[] = "april", ckey[10];
    scanf ("%s", ckey);
    printf(strcmp(key, ckey) ? "Wrong." : "Correct.");
    return 0;
}


