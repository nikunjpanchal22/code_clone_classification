int main () {
    int *sdimen, i;
    sdimen = malloc (10 * sizeof (int));
    sdimen[0] = 10;
    sdimen[1] = 20;
    printf ("\n.. %d... %d ", sdimen [0], sdimen [1]);
    int **twodimen;
    twodimen = malloc (sizeof (int *) * 10);
    for (i = 0; i < 10; i++) {
        twodimen[i] = malloc (sizeof (int) * 5);
    }
    twodimen[0][0] = 10;
    twodimen[0][3] = 30;
    twodimen[2][3] = 50;
    printf ("\n %d ... %d.... %d ", twodimen [0] [0], twodimen [0] [3], twodimen [2] [3]);
    return 0;
}


 
int main () {
    int sdimen[10], i;
    sdimen[0] = 10;
    sdimen[1] = 20;
    printf ("\n.. %d... %d ", sdimen [0], sdimen [1]);
    int twodimen[10][5];
    for (i = 0; i < 10; i++) {
        twodimen[i][0] = 0;
        twodimen[i][1] = 0;
        twodimen[i][2] = 0;
        twodimen[i][3] = 0;
        twodimen[i][4]  =0;
    }
    twodimen[0][0] = 10;
    twodimen[0][3] = 30;
    twodimen[2][3] = 50;
    printf ("\n %d ... %d.... %d ", twodimen [0] [0], twodimen [0] [3], twodimen [2] [3]);
    return 0;
}


