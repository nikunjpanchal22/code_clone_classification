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




#include <stdio.h>
#define SIZE 5
int main() {
    char cities[SIZE][20];
    float temperatures[SIZE * SIZE];
    printf("Please enter the yearly temperature of the five cities\n");
    for (int i = 0; i < SIZE; i++) {
        printf("Enter city %d \n", i + 1);
        scanf("%s", cities[i]);
        printf("Enter temperatures for city %d\n", i + 1);
        for (int j = i * SIZE; j < (i + 1) * SIZE; j++) {
            printf("For year %d\n", j % SIZE + 1);
            scanf("%f", &temperatures[j]);
        }
    }
    return 0;
}


