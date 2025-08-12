int main () {
    FILE *fp1;
    FILE *fp2;
    char line [100];
    char *token;
    const char s [2] = ",";
    fp1 = fopen ("file1.txt", "r");
    fp2 = fopen ("file2.txt", "a");
    while (fgets (line, sizeof (line), fp1)) {
        token = strtok (line, s);
        fprintf (fp2, "%s", token);
        token = strtok (NULL, s);
        fprintf (fp2, "%s\n", token);
    }
    fclose (fp1);
    fclose (fp2);
    return 0;
}


 
int main () {
    FILE *fp1;
    FILE *fp2;
    char line [100];
    char delimiter;
    char *token;
    fp1 = fopen ("file1.txt", "r");
    fp2 = fopen ("file2.txt", "a");
    while (fgets (line, sizeof (line), fp1)) {
        token = strtok (line, &delimiter);
        fputs (token, fp2);
        delimiter = ',';
        token = strtok (NULL, &delimiter);
        fputs (token, fp2);
        fputs ("\n", fp2);
    }
    fclose (fp1);
    fclose (fp2);
    return 0;
}


