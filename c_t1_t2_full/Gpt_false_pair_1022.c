int main (int argc, char *argv []) {
    char cmd [PATH_MAX];
    char result [PATH_MAX];
    int i;
    for (i = 1; i < argc; ++i) {
        FILE *fp = NULL;
        sprintf (cmd, "file '%s'", argv [i]);
        fp = popen (cmd, "r");
        if (fp == NULL) {
            perror ("popen");
        }
        else {
            fgets (result, PATH_MAX, fp);
            pclose (fp);
            fputs (result, stdout);
        }
    }
    return 0;
}


 
int main (int argc, char *argv []) {
    char cmd [PATH_MAX];
    char result [PATH_MAX];
    int i;
    for (i = 1; i < argc; ++i) {
        FILE *fp = NULL;
        sprintf (cmd, "file '%s' | tr -d '\\n' > x.txt", argv [i]);
        system (cmd);
        fp = fopen ("x.txt", "r");
        if (fp == NULL) {
            perror ("fopen");
        }
        else {
            fgets (result, PATH_MAX, fp); 
            fclose (fp);
            printf (result);
        }
    }
    return 0;
}
