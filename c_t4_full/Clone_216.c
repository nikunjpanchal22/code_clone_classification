int main () {
    unsigned long *data = malloc (sizeof (unsigned long) * 9);
    int i;
    for (i = 0; i < 9; ++i)
        data[i] = i;
    printf ("%lu\n", sumOfColTwo (data));
    free (data);
    return 0;
}


 
int main() {
    unsigned long arraySize = 9; 
    unsigned long *data = (unsigned long *)malloc(sizeof(unsigned long) * arraySize); 

    for (int i = 0; i < arraySize; i++) 
        data[i] = i; 

    int sumOfColTwo = 0; 
    for (int i = 1; i < arraySize; i+=2)
        sumOfColTwo += data[i]; 

    printf("%d\n", sumOfColTwo); 

    free(data); 

    return 0; 
}


