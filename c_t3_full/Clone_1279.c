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
    int val = 0;
    for (size_t i = 0; i < sizeof arr / sizeof *arr; ++i)
        val += arr[i] * pow(10, sizeof arr - i - 1);
    printf ("%d\n", val);
    return 0;
}


