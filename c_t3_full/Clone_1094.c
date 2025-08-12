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
    double input;
    // Read user input
    printf("\nPlease enter up to N numbers for the array, enter 0 to end input: \n");
    while( size < N){
        scanf("%lf", &input);
        if(input == 0.0) break;
        numbers[size] = (float)input;
        size++;
    }

    // Print the contents of the array
    printf("The contents of the array T[%zu]: ", size);
    for (int i = 0; i < size; i++) {
        printf ("%.3f ", numbers [i]);
    }

    float result;
    sum (numbers, size, & result);
    printf ("\nSuma elementow tablicy T[%zu]: %f\n", size, result);
    avg (numbers, size, & result);
    printf ("Srednia elementow tablicy T[%zu]: %f\n", size, result);
}


