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
main() {
int tableElements[12],value,counter;
printf("Choose a multiplication table: ");
printf("\n 2 \n 3 \n 4 \n 5 \n 6 \n 7 \n 8 \n 9 \n 10 \n11 \n12 \n");
for(counter=0;counter<12;counter++)
tableElements[counter]=counter+1;
scanf("%d",&value);
for(counter=0;counter<12;counter++)
printf("%d * %d = %d\n",value,tableElements[counter],value*tableElements[counter]);
}


