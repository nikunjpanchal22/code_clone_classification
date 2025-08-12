main () {
    const int numYears = 5;
    char cities [5] [20];
    float temps [25];
    int i;
    printf ("Please enter the yearly temperature of the five cities\n");
    for (i = 0; i <= 4; i++) {
        printf ("Enter city %d \n", i + 1);
        scanf ("%s", & cities [i]);
        printf ("Enter temperatures for city %d\n", i + 1);
        for (int j = (i * numYears); j < (i * numYears) + numYears; j++) {
            printf ("For year %d\n", (j % numYears) + 1);
            scanf ("%f", & temps [j]);
        }
    }
    return 0;
}





#include<stdio.h>
#define numCities 5
#define numYears 5
void main() {
    char cities[numCities][20];
    float temps[numYears*numCities];
    printf("Please enter the yearly temperature of the five cities\n");
    for (int i = 0; i < numCities; i++) {
        printf("Enter city %d \n", i + 1);
        scanf("%s", cities[i]);
        printf("Enter temperatures for city %d\n", i + 1);
        for (int j = numYears * i; j < numYears * (i + 1); j++) {
            printf("For year %d\n", (j % numYears) + 1);
            scanf("%f", &temps[j]);
        }
    }
}


