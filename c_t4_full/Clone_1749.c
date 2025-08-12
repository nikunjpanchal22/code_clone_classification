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
int main() {
    char str[100];
    scanf("%s", str);
    int i = 0;
    while (str[i]){
        if (!isalpha(str[i])){
            printf("Your string contains non-alphabet characters.\n");
            return 0;
        }
        i++;
    }
    printf("Your string is good.\n");
    return 0;
}


