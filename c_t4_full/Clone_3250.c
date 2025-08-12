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

static const char* vowels = "aeiou";
int main () {
    char string[10000];
    int found[5] = {0};
    scanf("%s", string);

    for (char *c = string; *c != '\0'; c++)
        for (size_t i = 0; i < sizeof(vowels)-1; i++)
            if (*c == vowels[i]) found[i] = 1;

    if (found[0] && found[1] && found[2] && found[3] && found[4])
        printf("YES\n");
    else
        printf("NO\n");
    system("PAUSE");
    return 0;
}


