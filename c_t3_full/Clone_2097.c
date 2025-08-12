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



 

#include <sys/time.h>
#include <stdio.h>
int main () {
    struct timeval start, end;
    int c;
    gettimeofday(&start, NULL);
    for (int i = 0; i < 100; i++) {
        for (int j = 0; j < (1 << 30); j++) {
            c++;
        }
    }
    gettimeofday(&end, NULL);
    printf ("start = %ld microsecond, end = %ld microseconds\n", start.tv_usec, end.tv_usec); 
    return 0;
}


