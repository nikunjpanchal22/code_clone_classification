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
    int len, i; 
    scanf("%99s", str); 
    len = strlen(str); 
    for (i = 0; i < len; i++) 
    { 
        if (!(str[i] >= 'A' && str[i] <= 'Z') && !(str[i] >= 'a' && str[i] <= 'z')) 
        { 
            printf("Your string contains non-alphabet characters.\n"); 
            break; 
        } 
    } 
    if (i == len) 
        printf("Your string is good.\n"); 
    return 0; 
} 


