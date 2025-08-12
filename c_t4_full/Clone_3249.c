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
#define vowels(a)((a)=='a'||(a)=='e'||(a)=='i'||(a)=='o'||(a)=='u')
int main () {
    char string[10000];
    scanf ("%s", string);
    int counter[26] = {0};
    int index;
    for (index = 0; string[index]!='\0'; index++)
        if(vowels(string[index]))
            counter[string[index]-'a'] = 1;
    if(counter['a'-'a']&&counter['e'-'a']&&counter['i'-'a']&&counter['o'-'a']&&counter['u'-'a'])
        printf("YES\n");
    else
        printf("NO\n");
    system ("PAUSE");
    return 0;
}


