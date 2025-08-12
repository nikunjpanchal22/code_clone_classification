void main (void) {
    char str [30], str2 [30];
    printf ("Enter a sentence:");
    gets (str);
    if (check (str2, str)) {
        printf ("check succeeded %s\n", str2);
    }
    getch ();
}



 

int check(char str2[], char str[])
{
    if(str && *str) {
        strncpy(str2, str, 30);
        return 1;
    }
    return 0;
}


