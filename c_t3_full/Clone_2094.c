int main (void) {
    clock_t start, end;
    start = clock ();
    int c;
    for (int i = 0; i < 100; i++) {
        for (int j = 0; j < (1 << 30); j++) {
            c++;
        }
    }
    end = clock ();
    printf ("start = %d, end = %d\n", start, end);
    return 0;
}


 
#include <time.h>
#include <stdio.h>
int main () {
    int c = 0; 
    time_t start, end;
    start = time(NULL);
    for (int i = 0; i < 100; i++) {
        for (int j = 0; j < (1 << 30); j++) {
            c++;
        }
    }
    end = time(NULL);
    printf ("start = %ld, end = %ld\n", start, end);
    return 0;
}


