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


int Main(){
    int myArray[12] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    int userChoice;
    printf("Let's practice times tables!\n");
    printf("|2|3|4|5|6|7|8|9|10|11|12|\n");
    printf("====================\n");
    scanf("%d", &userChoice);
    int i;
    for(i = 0; i < 12; i++){
        printf("%d X %d = %d\n", userChoice, myArray[i], userChoice * myArray[i]);
    }
    return 0;
}
