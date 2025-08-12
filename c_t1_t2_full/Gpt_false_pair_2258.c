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
    char first[25];
    int times = 0, count;
    printf ("Enter the amount of last names:\n");
    scanf ("%d", &count);
    printf ("Enter the first name\n");
    scanf ("%s", first);
    char last[count][25];
    for (int i = 0; i < count; i++)
        scanf ("%s", last[i]);
    for (int i = 0; i < count; i++) {
        if (strcmp (last[i], first) == 0)
            times++;
    }
    if (times == 0)
        printf ("First name not repeated\n");
    else
        printf ("First name repeated %d times", times);
    return 0;
}
