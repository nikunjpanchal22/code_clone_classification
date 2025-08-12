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





#include <stdio.h>
#include <stdlib.h>
#include <dlfcn.h>

int main (void) {
    void *handle;
    double (*cosine) (double);
    char *error;
    handle = dlopen ("/lib/x86_64-linux-gnu/libm.so.6", RTLD_NOW);
    if (!handle) {
        fprintf (stderr, "%s\n", dlerror());
        exit (1);
    }
    *(void**) (&cosine) = dlsym (handle, "cos");
    if ((error = dlerror()) != NULL)  {
        fprintf (stderr, "%s\n", error);
        exit (1);
    }
    printf ("%f\n", cosine(2.0));
    dlclose (handle);
    return 0;
}


