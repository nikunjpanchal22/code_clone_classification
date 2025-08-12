int main () {
    int na [10] = {0};
    int n [MaxL] [MaxC], i = 0;
    srand ((unsigned) time (NULL));
    while (i < MaxL) {
        int j = 0;
        while (j < MaxC) {
            int r = rand () % 10;
            if (na[r] < 2) {
                ++na[r];
                n[i][j] = r;
                printf (" %3d ", n [i] [j]);
                ++j;
            }
        }
        ++i;
        printf ("\n");
    }
    return 0;
}


 int main () {
    int na [10] = {0}, i, j, count;
    srand ((unsigned) time (NULL));
    for (i = 0; i < MaxL; i++) {
        count = 0;
        while (count < MaxC) {
            int r = rand () % 10;
            if (na[r] < 2) {
                ++na[r];
                int n[MaxL][MaxC] = r;
                printf (" %3d ", n [i] [j]);
                ++count;
            }
        }
        printf ("\n");
    }
    return 0;
}


