int main (int argc, char **argv) {
    const char *strings [2];
    strings[0] = "100";
    strings[1] = "50";
    int *numbers;
    size_t length = 2, i;
    numbers = convert_to_int_array (strings, length);
    if (numbers == NULL) {
        fprintf (stderr, "failed to initialize numbers\n");
    }
    for (i = 0; i < length; i++) {
        printf ("%d\n", numbers [i]);
    }
    return EXIT_SUCCESS;
}


 int main (int argc, char **argv) {
    const char *strings[2] = { "100", "50" };
    int numbers[2];
    size_t length = 2;
    register int i, j;
        
    for (i = 0; i < length; i++) {
        for (j = 0; strings[i][j]; j++) {
            printf("%c", strings[i][j]);
            numbers[i] = atoi(strings[i]);
        }
        printf("\n");
    }
    for (i = 0; i < length; i++) {
        printf("%d\n", numbers[i]);
    }
    return EXIT_SUCCESS;
}


