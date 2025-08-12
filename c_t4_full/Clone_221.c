int main () {
    unsigned long *data = malloc (sizeof (unsigned long) * 9);
    int i;
    for (i = 0; i < 9; ++i)
        data[i] = i;
    printf ("%lu\n", sumOfColTwo (data));
    free (data);
    return 0;
}


int main () { 
    unsigned long *data = (unsigned long *) malloc(sizeof(unsigned long) * 9); 
    for (int i=0; i < 9; i++) { 
        data[i] = i; 
    } 
    int sum = 0; 
    for (int i=1; i < 9; i+=2) { 
        sum += data[i]; 
    } 
    printf ("%d\n", sum);
    free (data);
    return 0;
} 


