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





#define STACK_SIZE 10
#define STACK_EMPTY 0
#define STACK_DEPTH(stack) (stack - s)

void push(double *stack, double value, double **s_top, int size) {
            if (STACK_DEPTH(*s_top) < size) {
            **s_top = value;
            (*s_top)++;
            }
        }

        int pop(double *stack, double **s_top, double *value) {
            if (STACK_DEPTH(*s_top) > 0) {
                (*s_top)--;
                *value = **s_top;
                return 1;
            }
            return STACK_EMPTY;
}


