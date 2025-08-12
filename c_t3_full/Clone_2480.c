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





#include <stdio.h>

int main (){
int tableRow [12] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
int chosenTable;
printf ("Please, select a table of multiplication from 2 to 12: ");
printf ("|2|3|4|5|6|7|8|9|10|11|12|\n\n");
scanf ("%d", & chosenTable);
int index;
for (index = 0; index < 12; index++)
printf ("%d operated with %d equals %d\n", chosenTable, tableRow [index], chosenTable * tableRow [index]);
}


