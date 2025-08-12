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
    int runnerCount;
    float time1[6], highestTime = 0;
    
    for (runnerCount = 0; runnerCount < 6; runnerCount++) {
        printf ("Input the time for runner number 1: ");
        scanf ("%f", &time1[runnerCount]);

        highestTime = (time1[runnerCount] > highestTime) ? time1[runnerCount] : highestTime;
    }
    printf ("The highest recorded time is: %.2f\n", highestTime);

    return 0;
}


