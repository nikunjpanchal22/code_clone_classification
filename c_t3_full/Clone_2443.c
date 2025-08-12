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
#include <ctype.h>
int main(){
    char str [100];
    scanf ("%99s", str);
    if(strpbrk(str, "0123456789!@#$%^&*()-=+_`~;:<>,.?/\\|{}[]") != NULL)
        printf ("Your string contains non-alphabet characters.\n");
    else
        printf("Your string is good.\n");
    return 0;
}


