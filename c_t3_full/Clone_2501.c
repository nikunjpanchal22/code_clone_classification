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





#include<stdio.h>
int main (void) {
    int num = 0, first = (1 << 30), last = -first - 1;
    while(scanf("%d", &num) == 1) {
        first = num < first ? num : first;
        last = num > last ? num : last;
    }
    for (num = first; num <= last; num++)
        printf ("%d\n", num);
    return 0;
}


