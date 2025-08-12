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





int main () {
    FILE *filestream;
    int row, col, i, j;
    float data [MHEIGHT] [MWIDTH];

    filestream = fopen ("graph.txt", "r");
    if (!filestream) 
        return 1;

    if (fscanf (filestream, "%d%d", &row, &col) != 2)
        return 1;

    if (row < 1 || row > MHEIGHT || col < 1 || col > MWIDTH) 
        return 1;
        
    for (j = 0; j < row; j++)
        for (i = 0; i < col; i++)
            if (fscanf (filestream, "%f", &data[j][i]) != 1)
                return 1;

    fclose (filestream);
    for (j = 0; j < row; j++) {
        for (i = 0; i < col; i++)
            printf ("%10.1f", data[j][i]);
        printf ("\n");
    }
    return 0;
}


