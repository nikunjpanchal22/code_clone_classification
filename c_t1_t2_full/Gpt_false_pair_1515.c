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
    int heightY, widthX, a, b;
    float dataArray [MHEIGHT] [MWIDTH];
    if ((f = fopen ("plottestdata.txt", "r")) == NULL)
        exit (1);
    if (fscanf (f, "%d%d", &heightY, &widthX) != 2)
        exit (1);
    if (heightY < 1 || heightY > MHEIGHT || widthX < 1 || widthX > MWIDTH)
        exit (1);
    for (b = 0; b < heightY; b++)
        for (a = 0; a < widthX; a++)
            if (fscanf (f, "%f", &dataArray[b][a]) != 1)
                exit (1);
    fclose (f);
    for (b = 0; b < heightY; b++) {
        for (a = 0; a < widthX; a++)
            printf ("%10.1f", dataArray[b][a]);
        printf ("\n");
    }
    return 0;
}
