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
    FILE *fileI = NULL, *fileII = NULL;
    char *s1 = NULL, *s2 = NULL, line[MAX], *r = NULL, *w = NULL;
    double ep, si;
    fileI = fopen("dS.txt", "r");
    fileII = fopen("dR.txt", "w");
    if (fileI != NULL || fileII != NULL) {
        while((r = fgets(line, 255, fileI)) != NULL) {
            sscanf(r, "%s %s %Lf %Lf", &s1, &s2, &ep, &si);
            w = sprintf(w, "%s %s %2.5Lf %2.8Lf\n", &s1, &s2, ep, si);
            fprintf(fileII, "%s\n", w);
        }
        fclose(fileI);
        fclose(fileII);
    }
    return 0;
}


