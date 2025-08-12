int main (void) {
    char str [100] = {0};
    int len;
    scanf ("%99s", str);
    len = strlen (str);
    if (len != strspn (str, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"))
        printf ("Your string contains non-alphabet characters.\n");
    else
        printf ("Your string is good.\n");
    return 0;
}





#include <stdio.h>
#include <regex.h>
#include <string.h>
int main(){
    char str [100];
    scanf ("%99s", str);
    regex_t r;
    regcomp(&r, "^[a-zA-Z]*$", 0);
    if(regexec(&r, str, 0, NULL, 0))
        printf ("Your string contains non-alphabet characters.\n");
    else
        printf ("Your string is good.\n");
    regfree(&r);
    return 0;
}


