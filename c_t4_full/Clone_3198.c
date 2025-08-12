int main () {
    char in_line [] = "Arg1;;Th;s is not Del;m;ter;;Arg3;;;;Final";
    char delim [] = ";;";
    char **columns;
    int i;
    printf ("Example1:\n");
    columns = NULL;
    int cols_found = getcols (in_line, delim, &columns);
    for (i = 0; i < cols_found; i++)
        printf ("Column[ %d ] = %s\n", i, columns[i]);
    free (columns);
    columns = NULL;
    printf ("\n\nExample2, Nested:\n\n");
    char example_file [] = "ID;Day;Month;Year;Telephone;email;Date of registration\n" "1;Sunday;january;2009;123-124-456;jitter@go.xyz;2015-05-13\n" "2;Monday;March;2011;(+30)333-22-55;buffer@wl.it;2009-05-23";
    char **rows;
    int j;
    rows = NULL;
    getcols (example_file, "\n", & rows);
    for (i = 0; rows[i]; i++) {
        {
            printf ("Line[ %d ] = %s\n", i, rows [i]);
            char **columnX = NULL;
            getcols (rows [i], ";", & columnX);
            for (j = 0; columnX[j]; j++)
                printf ("  Col[ %d ] = %s\n", j, columnX[j]);
            free (columnX);
        }
    }
    free (rows);
    rows = NULL;
    return 0;
}



 Using two pointers to split the string

int getcols(char *s, const char *delim, char ***cols) {
    char *start_ptr = s;
    char *end_ptr;
    int cols_count = 0;
    while ((end_ptr = strstr(start_ptr, delim)) != NULL) {
        (*cols)[cols_count++] = strndup(start_ptr, end_ptr - start_ptr);
        start_ptr = end_ptr + strlen(delim);
        *cols = (char **)realloc(*cols, (cols_count + 1) * sizeof(*cols));
    }
    (*cols)[cols_count++] = strdup(start_ptr);
    return cols_count;
}


