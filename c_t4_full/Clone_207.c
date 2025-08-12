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


 int main () {
    int i, j;
    int cm;
    for (i = 0; i <= 7; i += 1) {
        for (j = 0; j <= 11; j += 1) {
            cm = round ((i *30.48 + j * 2.54)/ 0.1);
            printf ("%5d", cm * 10);
        }
        printf ("\n");
    }
    return 0;
}


