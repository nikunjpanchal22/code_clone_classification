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
    char numbers_string[][64] = { "100", "50" };
    int numbers_length = 2;
    int numbers[numbers_length];
    int i;
        
    for (i = 0; i < numbers_length; i++) {
        sscanf(numbers_string[i], "%d", &numbers[i]);
    }
    
    for (i = 0; i < numbers_length; i++) {
        printf("%d\n", numbers[i]);
    }
    
    return EXIT_SUCCESS;
}


