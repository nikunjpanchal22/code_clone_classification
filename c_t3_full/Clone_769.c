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
    float timerunner1[6], maximum = INT_MIN;
    for (x=0; x<6; x++) {
        printf("Give me the time of runner 1: ");
        scanf("%f", &timerunner1[x]);
        maximum = MAX(maximum, timerunner1[x]);
    }
    printf("Maximum time is %f\n", maximum);
    return 0;
}


