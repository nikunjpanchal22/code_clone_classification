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
int multiplier[12],value;
for(int i=1;i<=12;i++)
multiplier[i-1]=i;
printf("\nWhich multiplication table you want: ");
scanf("%d",&value);
for(int i=0;i<12;i++)
printf("\n%d * %d = %d",value,multiplier[i],value*multiplier[i]);
}


