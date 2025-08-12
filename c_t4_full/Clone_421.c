int main () {
    char my_string [] = "1.0,2.0,3.0";
    float *my_array;
    char **strs;
    size_t count;
    strs = split (my_string, ", \t", &count);
    my_array = (float *) malloc (sizeof (float) * count);
    {
        int i;
        for (i = 0; i < count; ++i)
            my_array[i] = (float) atof (strs[i]);
        free4split (strs);
    }
    {
        int i;
        for (i = 0; i < count; ++i)
            printf ("%f\n", my_array[i]);
    }
    return 0;
}


	int main () {
    char my_string [] = "1.0,2.0,3.0";
    float *my_array;
    size_t count; 
    size_t i; 
    char *delim = ",";
    char *ptr;
    my_array = (float*)malloc(sizeof(float) * strlen(my_string));

    ptr = strtok(my_string, delim);
    while(ptr != NULL)
    {
        *(my_array + i) = atof(ptr); 
        count++; 
        ptr = strtok(NULL, delim); 
        i++; 
    }
    for (i = 0; i < count; ++i)
        printf ("%f\n", my_array[i]);

    free(my_array); 
    return 0;
}


