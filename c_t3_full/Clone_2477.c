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
    float bestTime = 0, runnerTime[6];
    
    for (i = 0; i < 6; i++) {
        printf("Enter runner's time: ");
        scanf("%f", &runnerTime[i]);

        bestTime = (bestTime < runnerTime[i]) ? runnerTime[i] : bestTime;
    }

    printf("Best time: %.2f\n", bestTime);
    
    return 0;
}


