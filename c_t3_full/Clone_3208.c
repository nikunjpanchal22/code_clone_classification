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
int main () {
    char s[10000];
    int length, a=0, e=0, i=0, o=0, u=0;
    scanf("%d", &length);
    scanf("%s", s);
    for(int n=0; n<length; n++){
        if(s[n]=='a') a=1;
        else if(s[n]=='e') e=1;
        else if(s[n]=='i') i=1;
        else if(s[n]=='o') o=1;
        else if(s[n]=='u') u=1;
    }
    printf((a && e && i && o && u) ? "YES\n" : "NO\n");
    system("PAUSE");
    return 0;
}


