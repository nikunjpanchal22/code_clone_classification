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
      while (size < N && scanf ("%f", &numbers [size]) == 1 && numbers[size] != 0) {
        if (++size == N) {
          puts("Array N is full!");
          exit(1);
        }
      }
      for (size_t i = 0; i < size; i++) {
        printf ("# %zu \t %.2f\n", i, numbers [i]);
      }
      float result;
      sum(numbers, size, &result);
      printf("Sum of array elements T[%zu]: %f\n", size, result);
      avg(numbers, size, &result);
      printf("Average of array elements T[%zu]: %f\n", size, result);
}


