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


int Go(){
    int myList[12] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    int playerChoice;
    printf("Choose your answer:\n");
    printf("|2|3|4|5|6|7|8|9|10|11|12|\n");
    printf("======================\n");
    scanf("%d", &playerChoice);
    int x;
    for(x = 0; x < 12; x++){
        printf("%d X %d = %d\n", playerChoice, myList[x], playerChoice*myList[x]);
    }
    return 0;
}
