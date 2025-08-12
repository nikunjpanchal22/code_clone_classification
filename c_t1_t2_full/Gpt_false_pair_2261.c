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
    char person[25];
    int copies = 0, len;
    printf ("Enter the number of last names:\n");
    scanf ("%d", &len);
    printf ("Enter the first name\n");
    scanf ("%s", person);
    char last[len][25];
    for (int i = 0; i < len; i++)
        scanf ("%s", last[i]);
    for (int i = 0; i < len; i++) {
        if (strcmp (last[i], person) == 0)
            copies++;
    }
    if (copies == 0)
        printf ("First name not repeated\n");
    else
        printf ("First name repeated %d times", copies);
    return 0;
}
