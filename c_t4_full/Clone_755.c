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
    int vowel_count = 0;
    scanf("%d", &len);
    scanf("%s", string);
    
    for (int i = 0; i < len; i++) {
        switch(tolower(string[i])) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                vowel_count++;
                break;
        }
    }
    
    if(vowel_count >= 5)
        printf("YES\n");
    else
        printf("NO\n");
    return 0;
}


