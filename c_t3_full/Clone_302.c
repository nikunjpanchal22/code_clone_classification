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
    FILE *fp1 = NULL, *fp2 = NULL;
    char *store1 = NULL, *store2 = NULL, line[MAX], *read1 = NULL, *write2 = NULL;
    double ep, si;
    fp1 = fopen ("dS.txt", "r");
    fp2 = fopen ("dR.txt", "w");
    if (fp1 != NULL || fp2 != NULL) {
        while ((read1 = fgets(line, 255, fp1)) != NULL) {
            sscanf(read1, "%s %s %Lf %Lf", &store1, &store2, &ep, &si);
            write2 = sprintf(write2, "%s %s %2.5Lf %2.8Lf\n", &store1, &store2, ep, si);
            fprintf(fp2, "%s\n", write2);
        }
        fclose(fp1);
        fclose(fp2);
    }
    return 0;
}


