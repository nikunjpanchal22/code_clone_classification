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
    FILE *fpone = NULL, *fptwo = NULL;
    char *storageone = NULL, *storagetwo = NULL, line[MAX], *red = NULL, *write = NULL;
    double ep, si;
    fpone = fopen ("dS.txt", "r");
    fptwo = fopen ("dR.txt", "w");
    if (fpone != NULL || fptwo != NULL) {
        while ((red = fgets(line, 255, fpone)) != NULL) {
            sscanf(red, "%s %s %Lf %Lf", &storageone, &storagetwo, &ep, &si);
            write = sprintf(write, "%s %s %2.5Lf %2.8Lf\n", &storageone, &storagetwo, ep, si);
            fprintf(fptwo, "%s\n", write);
        }
        fclose(fpone);
        fclose(fptwo);
    }
    return 0;
}


