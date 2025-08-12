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
    // Read user input
    printf("\nPlease enter up to N numbers for the array, press enter to end input: \n");
    do{
        scanf("%f", &numbers[size]);
        size++;
    }while( size < N);

    // Print the contents of the array
    printf("The contents of the array T[%zu]: ", size);
    for (int i = 0; i < size; i++) {
        printf ("%.2f ", numbers [i]); 
    }

    float result;
    sum (numbers, size, & result);
    printf ("\nSuma elementow tablicy T[%zu]: %f\n", size, result);
    avg (numbers, size, & result);
    printf ("Srednia elementow tablicy T[%zu]: %f\n", size, result);
}


