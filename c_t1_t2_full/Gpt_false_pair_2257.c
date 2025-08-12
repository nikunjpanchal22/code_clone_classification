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
    char initial[25];
    int occurrence_num = 0, number;
    printf ("Enter the size of last names:\n");
    scanf ("%d", &number);
    printf ("Enter the first name\n");
    scanf ("%s", initial);
    char last[number][25];
    for (int i = 0; i < number; i++)
        scanf ("%s", last[i]);
    for (int i = 0; i < number; i++) {
        if (strcmp (last[i], initial) == 0)
            occurrence_num++;
    }
    if (occurrence_num == 0)
        printf ("First name not repeated\n");
    else
        printf ("First name repeated %d times", occurrence_num);
    return 0;
}
