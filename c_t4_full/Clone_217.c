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
    int arrSize = 9, i;
    int sum = 0;
    unsigned long *data = (unsigned long*) malloc(arrSize * sizeof(unsigned long));
    for(i = 0; i < arrSize; i++)
        data[i] = i;
   
    for(i = 1; i < arrSize; i+=2) 
        sum += data[i];
    printf("%d\n", sum);
    
    free(data);
    return 0;
}


