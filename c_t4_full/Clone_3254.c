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
    int vowelsChecker[128] = {0};
    int length = strlen(string);
    for(int index = 0; index < length; index++){
        vowelsChecker[string[index]] = 1;
    }
    printf((vowelsChecker['a'] && vowelsChecker['e'] && vowelsChecker['i'] && vowelsChecker['o'] && vowelsChecker['u']) ? "YES\n" : "NO\n");
    system("pause");
    return 0;
}


