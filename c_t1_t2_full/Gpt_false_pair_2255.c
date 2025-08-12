int main (void) {
    char first [25];
    int index = 0, n;
    printf ("Enter the number of last names :\n");
    scanf ("%d", & n);
    printf ("Enter the first name \n");
    scanf ("%s", first);
    char last [n] [25];
    for (int i = 0; i < n; i++)
        scanf ("%s", last[i]);
    for (int i = 0; i < n; i++) {
        if (strcmp (last[i], first) == 0)
            index++;
    }
    if (index == 0)
        printf ("First name not repeated\n");
    else
        printf ("First name repeated %d times", index);
    return 0;
}


 int main (void) {
    char name[25];
    int duplicate_count = 0, length;
    printf ("Enter the size of last names:\n");
    scanf ("%d", &length);
    printf ("Enter the first name\n");
    scanf ("%s", name);
    char last[length][25];
    for (int i = 0; i < length; i++)
        scanf ("%s", last[i]);
    for (int i = 0; i < length; i++) {
        if (strcmp (last[i], name) == 0)
            duplicate_count++;
    }
    if (duplicate_count == 0)
        printf ("First name not repeated\n");
    else
        printf ("First name repeated %d times", duplicate_count);
    return 0;
}
