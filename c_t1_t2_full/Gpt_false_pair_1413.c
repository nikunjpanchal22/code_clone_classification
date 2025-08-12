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
    int count_blocks = 12;
    char *final_string = NULL;
    char *temp = NULL;
    for (int i = 0; i < count_blocks; i++) {
        char *block = some_hash_table.pop (i);
        asprintf (& final_string, "%s%s", (temp == NULL ? "" : temp), block);
        if (temp)
            free (temp);
        temp = final_string;
    }
    printf ("%s\n", final_string);
    free (final_string);
    return 0;
}
