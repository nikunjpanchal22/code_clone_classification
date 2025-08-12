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
    int num_bites = 12;
    char *stringy = NULL;
    char *helper = NULL;
    for (int i = 0; i < num_bites; i++) {
        char *bite = some_hash_table.pop (i);
        asprintf (& stringy, "%s%s", (helper == NULL ? "" : helper), bite);
        if (helper)
            free (helper);
        helper = stringy;
    }
    printf ("%s\n", stringy);
    free (stringy);
    return 0;
}
