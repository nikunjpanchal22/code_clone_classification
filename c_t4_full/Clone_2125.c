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
    int len = strlen(str);
    for(int i=0; i<len; i++){
        str2[i] = str[i];
    }
    str2[len] = '\0';
    return len != 0;
}


