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
    float my_array[3];
    size_t count;
    int i;
    char *p = strtok (my_string, ", \t");
    for (i = 0; p != NULL; i++)
    {
        my_array[i] = atof (p);
        count++;
        p = strtok (NULL, ", \t");
    }
    for (i = 0; i < count; ++i)
            printf ("%f\n", my_array[i]);

    return 0;
}


