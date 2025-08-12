int main () {
    for (x = 0; x < 6; x++) {
        printf ("Give me the time of runner 1: ");
        scanf ("%f", & timerunner1 [x]);
        maximum = maximum > timerunner1[x] ? maximum : timerunner1[x];
    }
    printf ("%f\n", maximum);
    return 0;
}






#include <stdio.h>

int main () {
    int i;
    float runner1[6], greatest = 0;
    
    for (i = 0; i < 6; i++) {
        printf ("Input time for runner 1: ");
        scanf ("%f", &runner1[i]);

        if (greatest < runner1[i]) {
            greatest = runner1[i];
        }
    }
    printf ("The greatest value is: %.2f\n", greatest);

    return 0;
}


