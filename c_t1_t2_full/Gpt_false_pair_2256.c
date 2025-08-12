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
    char initial [25];
    int num_repeat = 0, size;
    printf ("Enter the number of last names:\n");
    scanf ("%d", &size);
    printf ("Enter the first name\n");
    scanf ("%s", initial);
    char last [size] [25];
    for (int i = 0; i < size; i++)
        scanf ("%s", last[i]);
    for (int i = 0; i < size; i++) {
        if (strcmp (last[i], initial) == 0)
            num_repeat++;
    }
    if (num_repeat == 0)
        printf ("First name not repeated\n");
    else
        printf ("First name repeated %d times", num_repeat);
    return 0;
}
