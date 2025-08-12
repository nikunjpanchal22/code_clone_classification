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
    strcpy(str2, str);
    return strlen(str) > 0;
}


