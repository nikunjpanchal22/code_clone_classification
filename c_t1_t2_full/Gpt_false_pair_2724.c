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
    float values [N];
    size_t size = 0;
    while (size < N && scanf ("%f", values +size) == 1 && values[size] != 0) {
        size++;
    }
    for (size_t i = 0; i < size; i++) {
        printf ("%.2f ", values [i]);
    }
    float result;
    calcSum (values, size, & result);
    printf ("\nSuma elementow tablicy T[%zu]: %f\n", size, result);
    calculateAvg (values, size, & result);
    printf ("Srednia elementow tablicy T[%zu]: %f\n", size, result);
}
