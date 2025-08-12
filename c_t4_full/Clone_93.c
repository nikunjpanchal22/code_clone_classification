int main () {
    void *ptr = malloc (sizeof (int) * 4);
    int (*a) [2];
    a = ptr;
    for (int i = 0; i < 2; ++i)
        for (int j = 0; j < 2; ++j)
            a[i][j] = i * 100 + j;
    for (int i = 0; i < 2; ++i)
        for (int j = 0; j < 2; ++j)
            printf ("a[%d][%d]=%d\n", i, j, a[i][j]);
    free (ptr);
    return 0;
}


 int main() { 
   int* ptr = (int*) malloc(4 * sizeof(int)); 
   int (*a)[2] = (int (*)[2] )ptr; 

   for (int i=0; i<2; ++i) { 
       for (int j=0; j<2; ++j) { 
            a[i][j]= i*1000 + (10*j); 
        } 
    } 

   for(int i=0; i<2; ++i) { 
       for (int j=0; j<2; ++j) { 
            printf("a[%d][%d] = %d\n", i, j, a[i][j]); 
        } 
    } 
   
   free(ptr); 
   return 0; 
} 


