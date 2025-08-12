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
    int size = 9;
    int sumOfColTwo = 0;
    unsigned long *data = (unsigned long*) malloc(size * sizeof(unsigned long));
    
    int i;
    for (i = 0; i < size; i++)
        data[i] = i;
   
    for (i = 1; i < size; i+=2) 
        sumOfColTwo += data[i];
    
    printf("%d\n", sumOfColTwo);
    free(data);
    return 0;
}


