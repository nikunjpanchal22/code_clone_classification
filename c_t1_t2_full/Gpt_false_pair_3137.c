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
	FILE *file_ptr = fopen ("test_data.txt", "r");
	if (file_ptr == NULL) {
		perror ("fopen");
		exit (EXIT_FAILURE);
	}
	
	Data *temp;
	temp = malloc (sizeof (*temp) * 50);
	if (temp == NULL) {
		perror ("malloc");
		exit (EXIT_FAILURE);
	}

	char buf [512];
	int i = 0;
	while ((i < 50) && (fgets (buf, sizeof buf, file_ptr))) {
		sscanf (buf, "%d%99s%99s%lf%lf%u", &temp [i].date, temp [i].currency, temp [i].exchange, &temp [i].low, &temp [i].high, &temp [i].daily_cap);
		i++;
	}
	fclose (file_ptr);
	free (temp);
	return 0;
}
