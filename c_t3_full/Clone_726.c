int main (void) {
    char str [100] = {0};
    int len;
    scanf ("%99s", str);
    len = strlen (str);
    if (len != strspn (str, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"))
        printf ("Your string contains non-alphabet characters.\n");
    else
        printf ("Your string is good.\n");
    return 0;
}


 int main (void) 
{ 
    char str[100] = {0}; 
    int len; 
    scanf("%99s", str); 
    len = strlen(str); 
    for (int i = 0; i < len; i++) 
    { 
        if ((str[i] | 32 < 'A') || (str[i] | 32 > 'z')) 
        { 
            printf("Your string contains non-alphabet characters.\n"); 
            break; 
        } 
    } 
    if (len == i) 
        printf("Your string is good.\n"); 
    return 0; 
}


