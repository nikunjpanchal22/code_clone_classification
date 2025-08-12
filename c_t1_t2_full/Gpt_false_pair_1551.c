int main (int argc, char **argv) {
    void *handle;
    double (*cosine) (double);
    char *error;
    handle = dlopen ("libm.so", RTLD_LAZY);
    if (!handle) {
        fprintf (stderr, "%s\n", dlerror ());
        exit (EXIT_FAILURE);
    }
    dlerror ();
    *(void**) (&cosine) = dlsym (handle, "cos");
    if ((error = dlerror ()) != NULL) {
        fprintf (stderr, "%s\n", error);
        exit (EXIT_FAILURE);
    }
    printf ("%f\n", (* cosine) (2.0));
    dlclose (handle);
    exit (EXIT_SUCCESS);
}


 int main(int argc, char** argv){
    void *handle; 
    double(*cosine)(double); 
    char *error;
    handle = dlopen("libm.so", RTLD_NODELETE | RTLD_GLOBAL); 
    if (!handle){ 
        fprintf(stderr, "%s\n", dlerror());  
        exit(EXIT_FAILURE); 
    } 
    dlerror(); 
    *(void**) &cosine = dlsym(handle, "cos");  
    if((error = dlerror()) != NULL){ 
        fprintf(stderr, "%s\n", error); 
        exit(EXIT_FAILURE); 
    } 
    printf("%f\n", (*cosine)(2.0)); 
    dlclose(handle); 
    exit(EXIT_SUCCESS); 
}
