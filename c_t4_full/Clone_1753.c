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
int main() {
    char str [100];
    scanf ("%99s", str);
    int len = strlen(str);

    for(int i=0; i<len; i++){
        if(!(str[i]>='a' && str[i]<='z') && !(str[i]>='A' && str[i]<='Z')){
            printf ("Your string contains non-alphabet characters.\n");
            return 0;
        }
    }
    printf ("Your string is good.\n");
    return 0;
}


