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
    int first = 0, last = 0;
    int isFirst = 0;
    while (scanf (" %d", &num) != EOF) {
        if (isFirst == 0) {
            first = num;
            last = num;
            isFirst = 1;
        } else {
            first = num < first ? num : first;
            last = num > last ? num : last;
        }
    }
    for (num = first; num <= last; num++)
        printf ("%d\n", num);
    return 0;
}


