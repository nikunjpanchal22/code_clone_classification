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
    int isValid = 1; 
    for (int i = 0; i < len; i++) 
    { 
        if ((str[i] & 0xDF < 'A') || (str[i] & 0xDF > 'z') || (str[i] & 0xDF > 'Z' && str[i] & 0xDF < 'a')) 
        { 
            isValid = 0; 
            break; 
        } 
    } 
    if (isValid) 
        printf("Your string is good.\n"); 
    else 
        printf("Your string contains non-alphabet characters.\n"); 
    return 0; 
} 


