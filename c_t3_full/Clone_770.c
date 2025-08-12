int main () {
    for (x = 0; x < 6; x++) {
        printf ("Give me the time of runner 1: ");
        scanf ("%f", & timerunner1 [x]);
        maximum = maximum > timerunner1[x] ? maximum : timerunner1[x];
    }
    printf ("%f\n", maximum);
    return 0;
}


 int main() { 
    int x;
    float timerunner1[6], maximum = 0;
    for (x=0; x<6; x++) {
        printf("Give me the time of runner 1: ");
        scanf("%f", &timerunner1[x]);
        maximum = greatestTime(timerunner1, maximum, x);
    }
    printf("%f\n", maximum);
    return 0;
}


