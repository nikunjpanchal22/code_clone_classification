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
#include <stdbool.h>
int main(){
    char str [100];
    scanf ("%99s", str);
    bool has_nonalpha = false;
    for (int i = 0; str[i] != '\0'; i++){
        if (!(str[i] >= 'a' && str[i] <= 'z') && !(str[i] >= 'A' && str[i] <= 'Z')){
            has_nonalpha = true;
            break;
        }
    }
    if (has_nonalpha)
        printf ("Your string contains non-alphabet characters.\n");
    else
        printf ("Your string is good.\n");
    return 0;
}


