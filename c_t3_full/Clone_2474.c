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
    int runner;
    float timerunner1[6], maxtime = 0;
    
    for (runner = 0; runner < 6; runner++) {
        printf ("Provide the time for runner 1: ");
        scanf ("%f", timerunner1 + runner);

        maxtime = (timerunner1[runner] > maxtime) ? timerunner1[runner] : maxtime;
    }
    printf ("Max time is %f\n", maxtime);

    return 0;
}


