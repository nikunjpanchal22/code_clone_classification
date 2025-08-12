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
    FILE *file1 = NULL, *file2 = NULL;
    char *str1 = NULL, *str2 = NULL, line[MAX], *rd = NULL, *wr = NULL;
    double ep, si;
    file1 = fopen ("dS.txt", "r");
    file2 = fopen ("dR.txt", "w");
    if (file1 != NULL || file2 != NULL) {
        while ((rd = fgets(line, 255, file1)) != NULL) {
            sscanf(rd, "%s %s %Lf %Lf", &str1, &str2, &ep, &si);
            wr = sprintf(wr, "%s %s %2.5Lf %2.8Lf\n", &str1, &str2, ep, si);
            fprintf(file2, "%s\n", wr);
        }
        fclose(file1);
        fclose(file2);
    }
    return 0;
}


