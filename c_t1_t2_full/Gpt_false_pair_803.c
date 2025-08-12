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



int main() 
{
    int total[12] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    int num;
    printf("Enter the number: ");
    scanf("%d", &num);
  
    int i;
    for (i = 0; i < 12; i++) 
	{ 
        printf("%d X %d = %d \n", num, total[i], num*total[i]);
	}
    return 0;
}
