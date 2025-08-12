int main (void) {
    char str1 [30] = "Hello ";
    char str2 [30] = "World!";
    printf ("mystrcat(\"%s\", \"%s\") = %s\n", str1, str2, mystrcat (str1, str2, sizeof str1));
    char str3 [100] = "This is a long sentence";
    printf ("mystrcat(\"%s\", \"%s\") = %s\n", str1, str3, mystrcat (str1, str3, sizeof str1));
    char line [100];
    printf ("Enter some text: ");
    fflush (stdout);
    fgets (line, sizeof line, stdin);
    line[strcspn (line, "\n")] = 0;
    strcpy (str3, "User input was: ");
    printf ("mystrcat: %s\n", mystrcat (str3, line, sizeof str3));
    return 0;
}


int main (void) {
    char str1 [30] = "Hello ";
    char str2 [30] = "World!";
    printf ("mystrcat(\"%s\", \"%s\") = %s\n", str1, str2, mystrcat (str1, str2));
    char str3 [100] = "This is a long sentence";
    printf ("mystrcat(\"%s\", \"%s\") = %s\n", str1, str3, mystrcat (str1, str3));
    char line [100];
    printf ("Enter some text: ");
    fflush (stdout);
    fgets (line, sizeof line, stdin);
    line[strcspn (line, "\n")] = 0;
    strcpy (str3, "User input was: ");
    printf ("mystrcat: %s\n", mystrcat (str3, line));
    return 0;
}
