int main (void) {
    int array [SIZE], min, max;
    printf ("Enter %d numbers:\n", SIZE);
    for (size_t i = 0; i < SIZE; i++) {
        if (scanf ("%d", &array[i]) != 1) {
            printf ("Invalid number entered\n");
            exit (EXIT_FAILURE);
        }
    }
    max = min = array[0];
    for (size_t i = 1; i < SIZE; i++) {
        if (array[i] > max) {
            max = array[i];
        }
        else if (array[i] < min) {
            min = array[i];
        }
    }
    printf ("Maximum: %d\nMinimum: %d\n", max, min);
    return 0;
}


  int main (void) {
    int array [SIZE], min, max;
    printf ("Please provide %d integers:\n", SIZE);
    for (size_t i = 0; i < SIZE; i++) {
        if (scanf ("%d", &array[i]) != 1) {
            printf ("Invalid input\n");
            exit (EXIT_FAILURE);
        }
    }
    max = array[0]; 
    min = array[0];   
    for (size_t i = 1; i < SIZE; i++) {
        if (array[i] > max) {
            max = array[i];
        }
        else if (array[i] < min) {
            min = array[i];
        }
    }
    printf ("The largest number is: %d\nThe smallest number is: %d\n", max, min);
    return 0;
}
