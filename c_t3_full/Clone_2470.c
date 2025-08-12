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
    float timerunner1[6], maxTime = 0;
    
    for (i = 0; i < 6; i++) {
        printf ("Enter the time for runner 1: ");
        scanf ("%f", timerunner1 + i);
        
        if (maxTime < timerunner1[i]) {
            maxTime = timerunner1[i];
        }
    }
    printf ("Highest Time: %f\n", maxTime);

    return 0;
}


