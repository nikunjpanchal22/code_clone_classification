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
    int i=0, j;
    while(i<=7) {
        j=0;
        while (j<=11) {
            printf ("%5d", (int) round(i * 30.48 + j * 2.54));
            j++;
        }
        printf("\n");
        i++;
    }
    return 0;
}


