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
#define SIZE 5
int main() {
    char cities[SIZE][20];
    float temps[SIZE * SIZE];
    printf("Please enter the yearly temperature of the five cities\n");
    for (int cityIndex = 0; cityIndex < SIZE; cityIndex++) {
        printf("Enter city %d \n", cityIndex + 1);
        scanf("%s", cities[cityIndex]);
        printf("Enter temperatures for city %d\n", cityIndex + 1);
        for (int yearIndex = SIZE * cityIndex; yearIndex < SIZE * (cityIndex + 1); yearIndex++) {
            printf("For year %d\n", (yearIndex % SIZE) + 1);
            scanf("%f", &temps[yearIndex]);
        }
    }
    return 0;
}


