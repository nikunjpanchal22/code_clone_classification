void main () {
    fp = fopen ("26.txt", "r");
    char buffer [128];
    int a [100];
    int i = 0;
    freopen ("26.txt", "r", stdin);
    while (scanf ("%i", &a[i]) == 1 && buffer[i] != EOF)
        ++i;
    for (int j = 0; j < i; ++j)
        printf ("[%i]: %i\n", j, a[j]);
    fclose (stdin);
}



void main(){ 
    FILE *fp;  
    int i, j, a[100];
    fp = fopen("26.txt", "r"); 
    if (fp == NULL) { 
        printf("Could not open file"); 
        return 0; 
    } 
    
    for (i=0;fscanf(fp, "%d", &a[i]) != EOF; i++); 
    fclose(fp); 
    for (j=0; j<i; j++) 
        printf("[%d]: %d\n", j, a[j]);  
} 


