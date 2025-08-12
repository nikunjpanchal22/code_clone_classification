int main (void) {
    int num = 0;
    int first = (1U << 31) - 1;
    int last = (-first - 1);
    while (scanf (" %d", &num) != EOF) {
        first = num < first ? num : first;
        last = num > last ? num : last;
    }
    for (num = first; num <= last; num++)
        printf ("%d\n", num);
    return 0;
}


  int main (void) {
    int num = 0;
    int first = 0x7FFFFFFF, last = 0x80000000; 
    while (scanf (" %d", &num) != EOF) {
        first = (num < first) ? num : first; 
        last = (num > last) ? num : last; 
    }
    for (num = first; num <= last; num++)
        printf ("%d\n", num);
    return 0;
}


