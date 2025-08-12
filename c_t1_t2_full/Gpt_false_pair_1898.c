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


 main() {
    const int numYears = 5;
    char cities[5][20];
    float temps[25];
    int i;
    printf("Please enter the temperatures of the five cities for the past five years:\n");
    for (i = 0; i < 5; i++) {
        printf("What is the name of city %d? ", i + 1);
        scanf("%s", &cities[i]);
        for (int j = (i * numYears); j < (i * numYears) + numYears; j++) {
            printf("What is the temperature of year %d in city %d? \n", (j % numYears) + 1, i + 1);
            scanf("%f", &temps[j]);
        }
    }
    return 0;
}
