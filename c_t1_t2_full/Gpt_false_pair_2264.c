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
    char start[25];
    int apperance = 0, total;
    printf ("Enter the number of last names:\n");
    scanf ("%d", &total);
    printf ("Enter the first name\n");
    scanf ("%s", start);
    char last[total] [25];
    for (int i = 0; i < total; i++)
        scanf ("%s", last[i]);
    for (int i = 0; i < total; i++) {
        if (strcmp (last[i], start) == 0)
            apperance++;
    }
    if (apperance == 0)
        printf ("First name not repeated\n");
    else
        printf ("First name repeated %d times", apperance);
    return 0;
}
