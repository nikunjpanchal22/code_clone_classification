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
    FILE *file    = NULL, *fileTwo = NULL;
    char *x = NULL, *y = NULL, line[MAX], *e = NULL, *z = NULL;
    double ep, si;
    file = fopen("dS.txt", "r");
    fileTwo = fopen("dR.txt", "w");
    if (file != NULL || fileTwo != NULL) {
        while((e = fgets(line, 255, file)) != NULL) {
            sscanf(e, "%s %s %Lf %Lf", &x, &y, &ep, &si);
            z = sprintf(z, "%s %s %2.5Lf %2.8Lf \n", &x, &y, ep, si);
            fprintf(fileTwo, "%s", z);
        }
        fclose(file);
        fclose(fileTwo);
    }
    return 0;
}


