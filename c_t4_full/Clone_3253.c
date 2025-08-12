int main () {
    int len, a = 0, e = 0, i = 0, o = 0, u = 0, it;
    char string [10000];
    scanf ("%d", & len);
    scanf ("%s", string);
    for (it = 0; it < len; it++) {
        if (string[it] == 'a')
            a = 1;
        else if (string[it] == 'e')
            e = 1;
        else if (string[it] == 'i')
            i = 1;
        else if (string[it] == 'o')
            o = 1;
        else if (string[it] == 'u')
            u = 1;
    }
    if (a && e && i && o && u)
        printf ("YES\n");
    else
        printf ("NO\n");
    system ("PAUSE");
    return 0;
}





#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main () {
    char string[10000];
    scanf("%s", string);
    size_t length = strlen(string);
    int isVowelFunc[5] = {0, 0, 0, 0, 0};
    for(int x = 0; x < length; x++){
        int isVowel = string[x] - 'a';
        if(isVowel >= 0 && isVowel < 5) isVowelFunc[isVowel] = 1;
    }
    printf((isVowelFunc[0] && isVowelFunc[1] && isVowelFunc[2] && isVowelFunc[3] && isVowelFunc[4]) ? "YES\n" : "NO\n");
    system("pause");
    return 0;
}


