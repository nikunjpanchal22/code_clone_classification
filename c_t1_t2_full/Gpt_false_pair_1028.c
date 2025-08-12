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
    FILE *fp;
    char cmd [PATH_MAX];
    char result [PATH_MAX];
    int i;
    for (i = 1; i < argc; ++i) {
        sprintf (cmd, "file '%s'", argv [i]);
        fp = popen (cmd, "r");
        if (fp == NULL) {
            perror ("popen");
        }
        else {
            while (fgets (result, PATH_MAX, fp) != NULL)
                printf (result);
            pclose (fp);
        }
    }
    return 0;
}
