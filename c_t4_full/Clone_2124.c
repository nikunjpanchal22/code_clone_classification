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
    int i;
    for (i = 0; str[i] != '\0' && i < 30; ++i) {
        str2[i] = str[i];
    }
    str2[i] = '\0';
    return i > 0;
}


