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
#define MAX 5
int main() {
    int i, year, index;
    char cities[MAX][20];
    float temps[MAX * MAX];
    printf("Please enter the yearly temperature for the five cities\n");
    for (i = 0; i < MAX; i ++) {
        printf("Enter city %d \n", i + 1);
        scanf("%s", cities[i]);
        printf("Enter temperatures for city %d\n", i + 1);
        for (year = 0; year < MAX; year ++) {
            index = i * MAX + year;
            printf("For year %d\n", year + 1);
            scanf("%f", &(temps[index]));
        }
    }
    return 0;
}


