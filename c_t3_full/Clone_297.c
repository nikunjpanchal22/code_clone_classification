int main () {
    FILE *pfile1 = NULL, *pfile2 = NULL;
    char *sto1 = NULL, *sto2 = NULL, line [MAX];
    double ep, si;
    pfile1 = fopen ("dS.txt", "r");
    pfile2 = fopen ("dR.txt", "w");
    if (pfile1 != NULL || pfile2 != NULL) {
        while (fgets (line, 255, pfile1) != NULL) {
            sscanf (line, "%s %s %Lf %Lf", & sto1, & sto2, & ep, & si);
            fprintf (pfile2, "%s %s %2.5Lf %2.8Lf\n", & sto1, & sto2, ep, si);
        }
        fclose (pfile1);
        fclose (pfile2);
    }
    return 0;
}


 int main () {
    FILE *fileone = NULL, *filetwo = NULL;
    char *strone = NULL, *strtwo = NULL, line[MAX], *readone = NULL, *writeone = NULL;
    double ep, si;
    fileone = fopen("dS.txt", "r");
    filetwo = fopen("dR.txt", "w");
    if (fileone != NULL || filetwo != NULL) {
        while((readone = fgets(line, 255, fileone)) != NULL) {
            sscanf(readone, "%s %s %Lf %Lf", &strone, &strtwo, &ep, &si);
            writeone = sprintf(writeone, "%s %s %2.5Lf %2.8Lf \n", &strone, &strtwo, ep, si);
            fprintf(filetwo, "%s\n", writeone);
        }
        fclose(fileone);
        fclose(filetwo);
    }
    return 0;
}


