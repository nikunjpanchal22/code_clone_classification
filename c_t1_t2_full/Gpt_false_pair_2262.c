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
    char first_name[25];
    int times_appear = 0, num;
    printf ("Enter the number of last names:\n");
    scanf ("%d", &num);
    printf ("Enter the first name\n");
    scanf ("%s", first_name);
    char last_name[num][25];
    for (int i = 0; i < num; i++)
        scanf ("%s", last_name[i]);
    for (int i = 0; i < num; i++) {
        if (strcmp (last_name[i], first_name) == 0)
            times_appear++;
    }
    if (times_appear == 0)
        printf ("First name not repeated\n");
    else
        printf ("First name repeated %d times", times_appear);
    return 0;
}
