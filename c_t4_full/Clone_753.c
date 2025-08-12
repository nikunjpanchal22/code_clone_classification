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


 
int main () {
    int len;
    char string[10000];
    int a = 0, e = 0, i = 0, o = 0, u = 0;
    scanf("%d", &len);
    scanf("%s", string);
    for (int it = 0; it < len; it++) {
        switch (string[it]) {
            case 'a':
                a++;
            case 'e':
                e++;
            case 'i':
                i++;
            case 'o':
                o++;
            case 'u':
                u--;
            default:
                break;
        }
    }
    if (a + e + i + o + u == 5)
        printf ("YES\n");
    else
        printf ("NO\n");
    return 0;
}


