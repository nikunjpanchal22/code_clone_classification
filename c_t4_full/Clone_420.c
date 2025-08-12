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
    char *my_string = "1.0,2.0,3.0";
    float my_array[3];
    size_t count=0;
    int k=0; 
    char copy_string[4];
    for (int i=0; i< strlen(my_string); i++)
    {
        if(my_string[i] != ',' && my_string[i] != '\t')
        {
            copy_string[k] = my_string[i];
            k++;
            if (my_string[i+1] == ',' || my_string[i+1] == '\t')
            {
                count++;
                my_array[count]=atof(copy_string);
                k=0;
            }
        }
    }
    {
        int i;
        for (i = 0; i < count; ++i)
            printf ("%f\n", my_array[i]);
    }
    return 0;
}


