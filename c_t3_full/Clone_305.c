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
    FILE *pfileOne = NULL, *pfileTwo = NULL;
    char *storeOne = NULL, *storeTwo = NULL, line[MAX], *read = NULL, *write = NULL;
    double ep, si;
    pfileOne = fopen ("dS.txt", "r");
    pfileTwo = fopen ("dR.txt", "w");
    if (pfileOne != NULL || pfileTwo != NULL) {
        while ((read = fgets(line, 255, pfileOne)) != NULL) {
            sscanf(read, "%s %s %Lf %Lf", &storeOne, &storeTwo, &ep, &si);
            write = sprintf(write, "%s %s %2.5Lf %2.8Lf\n", &storeOne, &storeTwo, ep, si);
            fprintf(pfileTwo, "%s\n", write);
        }
        fclose(pfileOne);
        fclose(pfileTwo);
    }
    return 0;
}


