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
#define CITY_COUNT 5
#define YEAR_COUNT 5
int main() {
    char cities[CITY_COUNT][20];
    float temps[CITY_COUNT * YEAR_COUNT];
    puts("Please enter the yearly temperature of the five cities");
    for (int i = 0; i < CITY_COUNT; ++i) {
        printf("Enter city %d \n", i + 1);
        scanf("%s", cities[i]);
        printf("Enter temperatures for city %d\n", i + 1);
        for (int j = i * YEAR_COUNT; j < (i + 1) * YEAR_COUNT; j++) {
            printf("For year %d\n", (j % YEAR_COUNT) + 1);
            scanf("%f", &(temps[j]));
        }
    }
    return 0;
}


