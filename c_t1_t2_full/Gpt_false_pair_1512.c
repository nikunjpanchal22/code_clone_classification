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
    int sizeH, sizeW, var1, var2;
    float arrData [MHEIGHT] [MWIDTH];
    if ((f = fopen ("plottestdata.txt", "r")) == NULL)
        exit (1);
    if (fscanf (f, "%d%d", &sizeH, &sizeW) != 2)
        exit (1);
    if (sizeH < 1 || sizeH > MHEIGHT || sizeW < 1 || sizeW > MWIDTH)
        exit (1);
    for (var2 = 0; var2 < sizeH; var2++)
        for (var1 = 0; var1 < sizeW; var1++)
            if (fscanf (f, "%f", &arrData[var2][var1]) != 1)
                exit (1);
    fclose (f);
    for (var2 = 0; var2 < sizeH; var2++) {
        for (var1 = 0; var1 < sizeW; var1++)
            printf ("%10.1f", arrData[var2][var1]);
        printf ("\n");
    }
    return 0;
}
