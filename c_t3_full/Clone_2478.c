int main () {
    int Sum [12] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    int Choice;
    printf ("Pick Your Time's Table\n");
    printf ("|2|3|4|5|6|7|8|9|10|11|12|\n");
    printf ("===========================\n");
    scanf ("%d", & Choice);
    int i;
    for (i = 0; i < 12; i++) {
        printf ("%d X %d = %d\n", Choice, Sum [i], Choice * Sum [i]);
    }
    return 0;
}





#include<stdio.h>
int main () {
int rangeArray [12] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
int chosenMultiplicant;
printf ("Choose a multiplication table from the range : ");
printf ("|2|3|4|5|6|7|8|9|10|11|12|\n\n");
scanf ("%d", & chosenMultiplicant);
int iterator;
for (iterator = 0; iterator < 12; iterator++)
printf ("%d times %d equals %d\n", chosenMultiplicant, rangeArray [iterator], chosenMultiplicant * rangeArray [iterator]);
}


