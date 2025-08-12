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
int main () {
    char key[6] = "april";
    char ckey[6]; 
    scanf("%s", ckey);
    int i; for (i=0; i<5; i++) if (ckey[i] != key[i]) break;
    puts(i==5 ? "Correct." : "Wrong.");
    return 0;
}


