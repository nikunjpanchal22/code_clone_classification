int main () {
    int i, j;
    int cm, p;
    for (i = 0; i <= 7; i++) {
        for (j = 0; j <= 11; j++) {
            cm = round (i *30.48 + j * 2.54);
            printf ("%5d", cm);
        }
        printf ("\n");
    }
    return 0;
}


 

#define MAX_I 7
#define MAX_J 11
int main () {
    int i, j;
    double cm;
    for (i = 0; i <= MAX_I; i++) {
        for (j = 0; j <= MAX_J; j++) {
            cm = round(i * 30.48 + j * 2.54);
            printf ("%6.lf", cm);
        }
        printf ("\n");
    }
    return 0;
}


