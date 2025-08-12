int main (void) {
    FILE *fp = fopen ("test_data.txt", "r");
    if (fp == NULL) {
        perror ("fopen");
        exit (EXIT_FAILURE);
    }
    Data *tmp;
    tmp = malloc (sizeof (*tmp) * 50);
    if (tmp == NULL) {
        perror ("malloc");
        exit (EXIT_FAILURE);
    }
    char buf [512];
    int i = 0;
    while ((i < 50) && (fgets (buf, sizeof buf, fp))) {
        sscanf (buf, "%d%99s%99s%lf%lf%7d", & tmp [i].date, tmp [i].currency, tmp [i].exchange, & tmp [i].low, & tmp [i].high, & tmp [i].daily_cap);
        i++;
    }
    fclose (fp);
    free (tmp);
    return 0;
}


  int main (void) {
    FILE *fp = NULL;
    char file_name[] = "test_data.txt";
    fp = fopen (file_name, "r");
    if (fp == NULL) {
        fprintf(stderr, "Error: can't open %s \n", file_name);
        exit (EXIT_FAILURE);
    }
    Data *tmp;
    tmp = malloc (sizeof (*tmp) * 50);
    if (tmp == NULL) {
        printf("Failed to allocate memory.\n");
        exit (EXIT_FAILURE);
    }
    char buf [512];
    int i = 0;
    while ((i < 50) && (fgets (buf, sizeof buf, fp))) {
        sscanf (buf, "%d%99s%99s%lf%lf%7d", & tmp [i].date, tmp [i].currency, tmp [i].exchange, & tmp [i].low, & tmp [i].high, & tmp [i].daily_cap);
        i++;
    }
    fclose (fp);
    free (tmp);
    return 0;
}
