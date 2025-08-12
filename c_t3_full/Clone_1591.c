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
    double child, parent, randNum = 0;
    srand ((unsigned) time (NULL));
    for (int i = 0; i < STACK_SIZE; i++) {
        randNum = 33 + (double) (rand () % ((126 - 33) + 1));
        printf ("Random value: %f\n", randNum);
        push (s, randNum, & s_top, STACK_SIZE);
    }
    printf ("-----------\n");

    while (pop (s, &s_top, &parent) != STACK_EMPTY){
        printf ("Parent value: %f\n", parent);

        if((pop (s, &s_top, &child) != STACK_EMPTY))
            printf ("  Child value: %f\n", child);
    }
    return 0;
}


