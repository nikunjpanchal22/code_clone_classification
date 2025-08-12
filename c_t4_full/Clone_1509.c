int main () {
    unsigned long *data = malloc (sizeof (unsigned long) * 9);
    int i;
    for (i = 0; i < 9; ++i)
        data[i] = i;
    printf ("%lu\n", sumOfColTwo (data));
    free (data);
    return 0;
}





unsigned long sumOfColTwo(unsigned long *data){
    unsigned long sum = 0;
    for(int i=0;i<9;i++)
        sum += data[i];
    return sum;
}


