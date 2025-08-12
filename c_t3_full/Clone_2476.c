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
    int counter;
    float timeOfRunner1[6], greatestTime = 0.0;
    
    for (counter = 0; counter < 6; counter++) {
        printf ("Please enter time for runner 1: ");
        scanf ("%f", &timeOfRunner1[counter]);

        greatestTime = timeOfRunner1[counter] > greatestTime? timeOfRunner1[counter] : greatestTime;
    }
    printf ("Greatest time: %.2f\n", greatestTime);

    return 0;
}


