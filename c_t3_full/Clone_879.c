int main (void) {
    int array [10];
    srand (time (NULL));
    int i;
    for (i = 0; i < 10; i++)
        array[i] = rand () % 100 + 1;
    int smallestSoFar = array[0];
    for (i = 1; i < 10; i++)
        if (smallestSoFar > array[i])
            smallestSoFar = array[i];
    printf ("Smallest value: %d\n", smallestSoFar);
    return 0;
}


 int main (void) {
    int array[10];
    int i;
    int smallestSoFar;
    srand (time (NULL));
    for (i = 0; i < 10; i++) {
        array[i] = rand () % 100 + 1;
    }
    smallestSoFar = array[0];
    for (i = 1; i < 10; i++) {
        if (smallestSoFar > array[i])
            smallestSoFar = array[i];
    }
    printf ("Smallest value: %d\n", smallestSoFar);
    return 0;
}


