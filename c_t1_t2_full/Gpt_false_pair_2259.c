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
    int times_duplicated = 0, amount;
    printf ("Enter the number of last names:\n");
    scanf ("%d", &amount);
    printf ("Enter the first name\n");
    scanf ("%s", initial);
    char last[amount] [25];
    for (int i = 0; i < amount; i++)
        scanf ("%s", last[i]);
    for (int i = 0; i < amount; i++) {
        if (strcmp (last[i], initial) == 0)
            times_duplicated++;
    }
    if (times_duplicated == 0)
        printf ("First name not repeated\n");
    else
        printf ("First name repeated %d times", times_duplicated);
    return 0;
}
