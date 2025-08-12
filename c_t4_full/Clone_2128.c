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
    if (strlen(str) > 0) {
        sprintf(str2, "%s", str);
        return 1;
    }
    return 0;
}


