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
    float timeRunner1[6], highestTime = 0;
    
    for (i = 0; i < 6; i++) {
        printf ("Enter the run time for Performer 1: ");
        scanf ("%f", &timeRunner1[i]);

        highestTime = highestTime < timeRunner1[i]? timeRunner1[i] : highestTime;
    }
    printf ("Highest time: %.2f\n", highestTime);

    return 0;
}


