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
    double cm, num;
    for (i = 0; i <= 7; i++) {
        for (j = 0; j <= 11; j++) {
            num = i * 30.48 + j * 2.54;
            cm = floor(num + 0.5);
            printf ("%5d", cm);
        }
        printf ("\n");
    }
    return 0;
}


