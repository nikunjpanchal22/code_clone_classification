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
    if (len > 0) 
    { 
        char c = 63; 
        int i; 
        for (i = 0; i < len; i++) 
        { 
            c |= (1 << (str[i] & 0xE0)); 
            if (c >= 128) 
            { 
                printf("Your string contains non-alphabet characters.\n"); 
                break; 
            } 
        } 
        if (i == len) 
            printf("Your string is good.\n"); 
    } 
    return 0; 
} 


