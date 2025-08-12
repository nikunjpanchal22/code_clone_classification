int main (void) {
    float numbers [N];
    size_t size = 0;
    while (size < N && scanf ("%f", numbers +size) == 1 && numbers[size] != 0) {
        size++;
    }
    for (size_t i = 0; i < size; i++) {
        printf ("%.2f ", numbers [i]);
    }
    float result;
    sum (numbers, size, & result);
    printf ("\nSuma elementow tablicy T[%zu]: %f\n", size, result);
    avg (numbers, size, & result);
    printf ("Srednia elementow tablicy T[%zu]: %f\n", size, result);
}


 int main (void) {
    float numbers [N];
    size_t size = 0;
    int input;
    // Read user input
    printf("\nPlease enter up to N numbers, enter 0 to finish: \n");
    while( size < N && input != 0){
        scanf("%d", &input);
        if(input == 0) break;
        numbers[size] = (float) input;
        size++;
    }

    // Print the contents of the array
    printf("Content of array T[%zu]: ", size);
    for (int i = 0; i < size; i++) {
        printf ("%.2f ", numbers [i]);
    }

    float result;
    sum (numbers, size, & result);
    printf ("\nSuma elementow tablicy T[%zu]: %f\n", size, result);
    avg (numbers, size, & result);
    printf ("Srednia elementow tablicy T[%zu]: %f\n", size, result);
}


