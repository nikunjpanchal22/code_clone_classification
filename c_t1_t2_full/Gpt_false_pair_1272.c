int main () {
    static const unsigned int N = 50;
    node *data = malloc (N * sizeof (*data));
    int i = 0;
    srand ((unsigned) time (NULL));
    for (i = 0; i < N; ++i) {
        data[i].id = i + 1;
        sprintf (data [i].name, "String%.3d", 1 + rand () % 999);
    }
    genmsort (data, N, sizeof (data [0]), compare_node_names);
    for (i = 0; i < N; ++i)
        printf ("%s : %u\n", data[i].name, data[i].id);
    printf ("\n");
    genmsort (data, N, sizeof (data [0]), compare_node_ids);
    for (i = 0; i < N; ++i)
        printf ("%s : %u\n", data[i].name, data[i].id);
    printf ("\n");
    free (data);
    return 0;
}


 int main() 
{ 
    static const unsigned int N = 50; 
    node *data = malloc(N * sizeof(*data)); 
    int i = 0; 
    srand((unsigned)time(0)); 
    for (i = 0; i < N ; ++i) 
    { 
        data[i].id = i + 1; 
        sprintf(data[i].name, "Name%.3d", 1 + rand() % 999); 
    } 
    genmsort (data, N, sizeof (data [0]), compare_node_names); 
    for (i = 0; i < N; ++i) 
        printf ("%s : %u\n", data[i].name, data[i].id); 
    printf ("\n"); 
    genmsort (data, N, sizeof (data [0]), compare_node_ids); 
    for (i = 0; i < N; ++i) 
        printf ("%s : %u\n", data[i].name, data[i].id); 
    printf ("\n"); 
    free (data); 
    return 0; 
}
