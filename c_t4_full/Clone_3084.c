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
    char key[] = "april", *ckey;
    ckey = (char*) malloc(6 * sizeof(char));
    printf ("Enter the key: ");
    scanf (" %5s", ckey);
    printf (!strcmp (ckey, key) ? "Correct.": "Wrong.");
    free(ckey);
    return 0;
}


