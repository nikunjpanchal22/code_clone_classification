int main (int argc, char *argv []) {
    int i;
    int number_of_chunks = 12;
    char *final_string = NULL;
    char *tmp = NULL;
    for (i = 0; i < number_of_chunks; i++) {
        char *chunk = some_hash_table.pop (i);
        asprintf (& final_string, "%s%s", (tmp == NULL ? "" : tmp), chunk);
        if (tmp)
            free (tmp);
        tmp = final_string;
    }
    printf ("%s\n", final_string);
    free (final_string);
    return 0;
}


 int main (int argc, char *argv []) {
    int n_chunks = 12;
    char *result_string = NULL;
    char * intermediar = NULL;
    for (int i = 0; i < n_chunks; i++) {
        char * chunk = some_hash_table.pop (i);
	result_string = realloc(result_string, snprintf(NULL, 0, "%s%s", intermediar == NULL ? "" : intermediar, chunk));
        sprintf(result_string, "%s%s", intermediar == NULL ? "" : intermediar, chunk);
        if (intermediar)
            free (intermediar);
        intermediar = result_string;
    }
    printf ("%s\n", result_string);
    free (result_string);
    return 0;
}
