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
#include <string.h>
#include <regex.h>
int main (){
    regex_t regex;
    char str [100];
    scanf ("%s", str);
    regcomp(&regex, "^[a-zA-Z]*$", 0);
    if (regexec(&regex, str, 0, NULL, 0) == REG_NOMATCH)
        printf ("Your string contains non-alphabet characters.\n");
    else
        printf ("Your string is good.\n");
    regfree(&regex);
    return 0;
}


