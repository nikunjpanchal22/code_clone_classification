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
    float timeRunner[6], max = 0;
    
    for (runner = 0; runner < 6; runner++) {
        printf("Enter runner 1 time: ");
        scanf("%f", &timeRunner[runner]);
        
       if(max < timeRunner[runner]) {
           max = timeRunner[runner];
       }
    }
    
    printf("Maximum time = %.2f", max);
    
    return 0;
}


