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
    int first = 2147483647, last = -2147483648;
    int isFirst = 1; //INITIALIZE
    while (scanf (" %d", &num) != EOF) {
        if (isFirst) {
            first = num;
            last = num;
            isFirst = 0;
        } else {
            first = num < first ? num : first;
            last = num > last ? num : last;
        }
    }
    for (num = first; num <= last; num++)
        printf ("%d\n", num);
    return 0;
}


