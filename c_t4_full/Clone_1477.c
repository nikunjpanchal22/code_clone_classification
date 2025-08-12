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
    int i = 0;
    while(i <= 7) {
        int j = 0;
        while(j <= 11) {
            int cm = round(i * 30.48 + j * 2.54);
            printf("%5d", cm);
            j++;
        }
        printf("\n");
        i++;
    }
    return 0;
}


