void main (void) {
    char str [30], str2 [30];
    printf ("Enter a sentence:");
    gets (str);
    if (check (str2, str)) {
        printf ("check succeeded %s\n", str2);
    }
    getch ();
}



 

int check(char *str2, char *str)
{
    if (!str || !*str) {
        return 0;
    }

    while (*str) {
        *str2++ = *str++;
    }
    
    *str2 = '\0';
    return 1;
}


