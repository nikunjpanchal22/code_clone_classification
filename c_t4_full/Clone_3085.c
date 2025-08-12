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
   char *key = "april";
   char ckey[6];
   printf ("Enter the key: ");
   scanf ("%s", ckey);
   printf("%s.", strcmp(key, ckey) ? "Wrong" : "Correct");
   return 0;
}


