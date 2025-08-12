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
    FILE *f1 = NULL, *f2 = NULL;
    char *m1 = NULL, *m2 = NULL, line[MAX], *rad = NULL, *word = NULL;
    double ep, si;
    f1 = fopen ("dS.txt", "r");
    f2 = fopen ("dR.txt", "w");
    if (f1 != NULL || f2 != NULL) {
        while ((rad = fgets(line, 255, f1)) != NULL) {
            sscanf(rad, "%s %s %Lf %Lf", &m1, &m2, &ep, &si);
            word = sprintf(word, "%s %s %2.5Lf %2.8Lf\n", &m1, &m2, ep, si);
            fprintf(f2, "%s\n", word);
        }
        fclose(f1);
        fclose(f2);
    }
    return 0;
}


