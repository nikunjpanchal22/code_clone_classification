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
    int numElems = 9;
    int result;
    unsigned long *data = malloc(sizeof(unsigned long) * numElems);
    int i;
    for (i = 0; i < numElems; i++)
        data[i] = i;
    result = sumOfColTwo(data);
    printf("%d\n", result);
    free(data);
    return 0;
}


