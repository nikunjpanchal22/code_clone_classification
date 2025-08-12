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
    unsigned long *data = (unsigned long*) calloc(9, sizeof(long));
    for (int i=0; i < 9; i++)
        data[i] = i;
    
    unsigned long total = 0;
    for (int i=1 ; i< 9; i+=2)
         total += data[i];
    printf ("%lu\n", total);
    free (data);
    return 0;
}


