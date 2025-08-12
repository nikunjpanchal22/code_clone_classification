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
    for (int i = 0; i < 8; ++i) {
        for (int j = 0; j < 12; ++j) {
            printf ("%5d", (int) round(i * 30.48 + j * 2.54));
        }
        printf("\n");
    }
    return 0;
}


