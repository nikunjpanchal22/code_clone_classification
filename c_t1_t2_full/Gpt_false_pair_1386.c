int main () {
    int i;
    int c = 0;
    char **arr = NULL;
    int count = 0;
    char str [80] = "JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC";
    c = dtmsplit (str, ",", &arr, &count);
    printf ("Found %d tokens.\n", count);
    for (i = 0; i < count; i++)
        printf ("string #%d: %s\n", i, arr[i]);
    return (0);
}


 int main() {
    int i;
    int c = 0;
    char **arr = NULL;
    int count = 0;
    char str[80] = "JAN\\FEB\\MAR\\APR\\MAY\\JUN\\JUL\\AUG\\SEP\\OCT\\NOV\\DEC";
    c = partitionStrings(str, "\\", &arr, &count);
    printf("Found %d tokens.\n", count);
    for (i = 0; i < count; i++)
        printf("string #%d: %s\n", i, arr[i]);
    return (0);
}
