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
    char str [100];
    scanf ("%s", str);
    int flag = 0;
    for(int i=0; str[i]; i++){
        if(isalpha(str[i])==0){
            flag = 1;
            break;
        }
    }
    if (flag == 1)
        printf ("Your string contains non-alphabet characters.\n");
    else
        printf ("Your string is good.\n");
    return 0;
}


