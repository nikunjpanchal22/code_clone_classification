int main (void) {
    FILE *f;
    int height, width, ii, jj;
    float array [MHEIGHT] [MWIDTH];
    if ((f = fopen ("plottestdata.txt", "r")) == NULL)
        exit (1);
    if (fscanf (f, "%d%d", &height, &width) != 2)
        exit (1);
    if (height < 1 || height > MHEIGHT || width < 1 || width > MWIDTH)
        exit (1);
    for (jj = 0; jj < height; jj++)
        for (ii = 0; ii < width; ii++)
            if (fscanf (f, "%f", &array[jj][ii]) != 1)
                exit (1);
    fclose (f);
    for (jj = 0; jj < height; jj++) {
        for (ii = 0; ii < width; ii++)
            printf ("%10.1f", array[jj][ii]);
        printf ("\n");
    }
    return 0;
}



int main (void) {
    FILE *f;
    int hgt, wdt, c1, c2;
    float arrVals [MHEIGHT] [MWIDTH];
    if ((f = fopen ("plottestdata.txt", "r")) == NULL)
        exit (1);
    if (fscanf (f, "%d%d", &hgt, &wdt) != 2)
        exit (1);
    if (hgt < 1 || hgt > MHEIGHT || wdt < 1 || wdt > MWIDTH)
        exit (1);
    for (c2 = 0; c2 < hgt; c2++)
        for (c1 = 0; c1 < wdt; c1++)
            if (fscanf (f, "%f", &arrVals[c2][c1]) != 1)
                exit (1);
    fclose (f);
    for (c2 = 0; c2 < hgt; c2++) {
        for (c1 = 0; c1 < wdt; c1++)
            printf ("%10.1f", arrVals[c2][c1]);
        printf ("\n");
    }
    return 0;
}
