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


 
int main()
{
    int len;
    char string[10000];
    int vowels[5] = {0};
    int it;
    scanf("%d", &len); 
    scanf("%s", string); 
    for (it = 0; it < len; it++) {
        switch (string[it]) {
            case 'a': 
                vowels[0]++;
                break;
            case 'e':
                vowels[1]++;
                break;
            case 'i':
                vowels[2]++;
                break;
            case 'o':
                vowels[3]++;
                break;
            case 'u': 
                vowels[4]++;
                break;
        }
    } 
    if (vowels[0] && vowels[1] && vowels[2] && vowels[3] && vowels[4] == 1)
        printf("YES\n");
     else
        printf("NO\n");
    return 0;
}


