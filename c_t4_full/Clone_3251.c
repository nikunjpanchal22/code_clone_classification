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
#include <ctype.h>
#include <stdlib.h>
int main () {
    char string[10000];
    int presence[26]={0};
    scanf("%s",string);
    for(int i = 0 ; string[i]!='\0' ; i++) {
        if(isalpha(string[i])) presence[tolower(string[i])-'a']++;
    }
    if(presence['a'-'a']&&presence['e'-'a']&&presence['i'-'a']&&presence['o'-'a']&&presence['u'-'a'])
       printf("YES\n"); 
    else
       printf("NO\n");
    system("pause");
    return 0;
}


