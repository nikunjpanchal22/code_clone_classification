int main (void) {
    int A [] = {5, -5, 14, 5, 2};
    int B [] = {3, 6, 11};
    int C [] = {4, 1, -3, 4};
    int D [] = {6, 2, 7, 1, 8, 2};
    int E [] = {2, 15};
    int F [] = {3, 4, -2};
    int *All [] = {A, B, C, D, E, F, NULL};
    int **line = All;
    int *col = *line;
    int *repeat = *line;
    int *astart = *line;
    int *acurr = astart;
    do {
        line = All;
        repeat = NULL;
        while (line && *line) {
            if (*line == astart) {
                ++acurr;
            }
            col = *line;
            col += acurr - astart;
            if (**line > (acurr - astart)) {
                printf ("%-5d", * col);
                if (**line > (acurr - astart) + 1) {
                    repeat = col;
                }
            }
            else {
                printf ("     ");
            }
            line++;
        }
        printf ("\n");
    }
    while (repeat);
    return 0;
}


int main (void) {
    int A [] = {5, -5, 14, 5, 2};
    int B [] = {3, 6, 11};
    int C [] = {4, 1, -3, 4};
    int D [] = {6, 2, 7, 1, 8, 2};
    int E [] = {2, 15};
    int F [] = {3, 4, -2};
    int *All [] = {A, B, C, D, E, F};
    int **line = All;
    int *col = *line;
    int *repeat = *line;
    int *astart = *line;
    int *acurr = astart;
    do {
        line = All;
        repeat = NULL;
        while (line && *line) {
            if (*line == astart) {
                ++acurr;
            }
            col = *line;
            col += acurr - astart;
            if (col[0] > (acurr - astart)) {
                printf ("%-5d", col[0]);
                if (col[0] > (acurr - astart) + 1) {
                    repeat = col;
                }
            }
            else {
                printf("     ");
            }
            line++;                      
        }
        printf("\n");
    } while (repeat);
    return 0;
}
