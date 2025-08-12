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
    char string[10000];
    scanf("%s", string);
    int a = 0, e = 0, i = 0, o = 0, u = 0;
    for(int index = 0; string[index] != '\0'; index++){
        switch(string[index]){
            case 'a': a = 1; break;
            case 'e': e = 1; break;
            case 'i': i = 1; break;
            case 'o': o = 1; break;
            case 'u': u = 1; break;
        }
    }
    printf((a && e && i && o && u) ? "YES\n" : "NO\n");
    system("pause");
    return 0;
}


