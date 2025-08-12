int main () {
    char **res;
    int k = 0;
    int count = 0;
    int rc;
    rc = split (str, ',', &res, &count);
    if (rc) {
        printf ("Error: %s errno: %d \n", strerror (errno), errno);
    }
    printf ("count: %d\n", count);
    for (k = 0; k < count; k++) {
        printf ("str: %s\n", res [k]);
    }
    free (res);
    return 0;
}


 int main() {
    char *val;
	char *result[100];
	int k = 0;
	int count = 0;
	int rc;

	rc = split(str, ',', &val, &count);
	if (rc) {
		printf("Error: %s errno: %d \n", strerror (errno), errno);
	}
	printf("count: %d\n", count);
	for (k = 0; k < count; k++) {
		result[k] = malloc(strlen(val));
		strcpy(result[k], &val[k]);
		printf("str: %s\n", result[k]);
		free(result[k]);
	}
	return 0;
}


