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
    FILE* fileA = NULL, *fileB = NULL;
    char* storeA = NULL, *storeB = NULL, line[MAX], *readA = NULL, *writeB = NULL;
    double ep, si;
    fileA = fopen("dS.txt", "r");
    fileB = fopen("dR.txt", "w");
    if (fileA != NULL || fileB != NULL) {
        while ((readA = fgets(line, 255, fileA)) != NULL) {
            sscanf(readA, "%s %s %Lf %Lf", &storeA, &storeB, &ep, &si);
            writeB = sprintf(writeB, "%s %s %2.5Lf %2.8Lf\n", &storeA, &storeB, ep, si);
            fprintf(fileB, "%s\n", writeB);
        }
        fclose(fileA);
        fclose(fileB);
    }
    return 0;
}


