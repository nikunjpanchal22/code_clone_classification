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
#include<limits.h>
int main (void) {
    int num = 0, first = INT_MAX, last = INT_MIN;
    while(~scanf(" %d", &num)) {
        first = num < first ? num : first;
        last = num > last ? num : last;
    }
    for (num = first; num <= last; num++)
        printf ("%d ", num);
    return 0;
}


