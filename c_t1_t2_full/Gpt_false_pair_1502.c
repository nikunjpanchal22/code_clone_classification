int main (void) {
    int arr [] = {0, 6, 88, 54};
    char buffer [1000] = {0};
    for (size_t i = 0; i < sizeof arr / sizeof *arr; ++i)
        sprintf (buffer, "%s%d", buffer, arr[i]);
    int val = strtol (buffer, NULL, 10);
    printf ("%d\n", val);
    return 0;
}



int main (void) {
    int arr [] = {0, 6, 88, 54};
    char buffer [1000] = {0};
    for (size_t i = 0; i < sizeof arr / sizeof *arr; ++i)
        strcat(buffer, tostring(arr[i]));
    int val = atoi (buffer);
    printf ("%d\n", val);
    return 0;
}
