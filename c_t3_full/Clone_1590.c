int main () {
    double s [STACK_SIZE];
    double *s_top = s;
    double randNum = 0;
    double i = 0;
    srand ((unsigned) time (NULL));
    for (i = 0; i < STACK_SIZE; i++) {
        randNum = 33 + (double) (rand () % ((126 - 33) + 1));
        printf ("Random value: %f\n", randNum);
        push (s, randNum, & s_top, STACK_SIZE);
    }
    printf ("-----------\n");
    while (pop (s, &s_top, &randNum) != STACK_EMPTY)
        printf ("Random value: %f\n", randNum);
    return 0;
}


 int main () {
    double s [STACK_SIZE];
    double *s_top = s;
    double first, second, randNum = 0;
    srand ((unsigned) time (NULL));
    for (int i = 0; i < STACK_SIZE; i++) {
        randNum = 33 + (double) (rand () % ((126 - 33) + 1));
        printf ("Random value: %f\n", randNum);
        push (s, randNum, & s_top, STACK_SIZE);
    }
    printf ("-----------\n");

    while (pop (s, &s_top, &first) != STACK_EMPTY){
        printf ("First value: %f\n", first);

        if((pop (s, &s_top, &second) != STACK_EMPTY))
            printf ("Second value: %f\n", second);
    }
    return 0;
}


