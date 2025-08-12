int main (void) {
    int oldar [2] [3] = {{1, 2, 3}, {4, 5, 6}};
    int newar [3] [2];
    transpose (& oldar [0] [0], & newar [0] [0], 2, 3);
    int i, j;
    for (i = 0; i < 2; i++) {
        for (j = 0; j < 3; j++)
            printf ("%d ", oldar[i][j]);
        printf ("\n");
    }
    for (i = 0; i < 3; i++) {
        for (j = 0; j < 2; j++)
            printf ("%d ", newar[i][j]);
        printf ("\n");
    }
}



int main (void) {
    int oldar [2] [3] = {{1, 2, 3}, {4, 5, 6}};
    int newar [3] [2];
    //transpose matrix using swap
    for(int i=0;i<2; i++){
      for(int j=i;j<3;j++){
        newar[j][i] = oldar[i][j];
        newar[i][j] = oldar[j][i];
      }
    }
    int i, j;
    for (i = 0; i < 2; i++) {
        for (j = 0; j < 3; j++)
            printf ("%d ", oldar[i][j]);
        printf ("\n");
    }
    for (i = 0; i < 3; i++) {
        for (j = 0; j < 2; j++)
            printf ("%d ", newar[i][j]);
        printf ("\n");
    }
}
