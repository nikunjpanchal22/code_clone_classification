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





#include <dlfcn.h>
#include <stdio.h>
#include <stdlib.h>

int main(int argc, char **argv) {
    void *handle;
    double (*cosine) (double);
    handle = dlopen ("libm.so", RTLD_GLOBAL | RTLD_NOW);
    if (!handle) {
        fprintf(stderr, "%s\n", dlerror());
        exit(EXIT_FAILURE);
    }
    *(void **)(&cosine) = dlsym(handle, "cos");
    printf("%f\n", cosine(2.0));
    dlclose(handle);
    exit(EXIT_SUCCESS);
}


