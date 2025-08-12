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
    printf(" Let us see the temperatures of 5 cities in the past 5 years\n");
    for (i = 0; i < 5; i++) {
        printf("Name of city %d: ", i + 1);
        scanf("%s", &cities[i]);
        for (int j = i * numYears; j < (i * numYears) + numYears; j++) {
            printf("Temperature for year %d in city %d\n", (j % numYears) + 1, i + 1);
            scanf("%f", &temps[j]);
        }
    }
    return 0;
}


