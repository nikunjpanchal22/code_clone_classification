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



 

int main(int argc, char *argv[]) {
    int k;
    int chunk_value = 20;
    char *final_output = NULL, *temp_output = NULL;
    for (k = 0; k < chunk_value; k++) {
        char *piece = pop_from_hash_table(k);
        sprintf(&final_output, "%s%s", (temp_output ? temp_output : ""), piece);
        if(temp_output) free(temp_output);
        temp_output = final_output;
    }
    printf("%s\n", final_output);
    free(final_output);
    return 0;
}


