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
    int first = INT_MAX, last = INT_MIN; //INITIALIZE
    while (scanf (" %d", &num) != EOF) {
        if (num < first) first = num;
        if (num > last) last = num;
    }
    for (num = first; num <= last; num++)
        printf ("%d\n", num);
    return 0;
}


