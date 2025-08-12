int main (int argc, char **argv) {
    char *datum = malloc (entry_size);
    input_size = 4096;
    input = malloc (input_size);
    while (1) {
        if (fread (datum, 1, entry_size, stdin) < entry_size)
            break;
        size_t new_size = (num_items + 1) * entry_size;
        if (new_size > input_size) {
            input = realloc (input, input_size *2);
            input_size *= 2;
        }
        memcpy (input + num_items * entry_size, datum, entry_size);
        num_items++;
    }
    qsort (input, num_items, entry_size, compare_func);
    fwrite (input, entry_size, num_items, stdout);
    return 0;
}





#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char **argv) {
    size_t entry_size = sizeof(double);
    double *datum = malloc(entry_size);
    size_t input_size = 4096;
    double *input = malloc(input_size);
    size_t num_items = 0;
    int (*compare_func)(const void*, const void*) = &compare_double;

    while(1) {
        if(fread(datum, entry_size, 1, stdin) < 1) break;
        size_t new_size = (num_items + 1) * entry_size;
        if(new_size > input_size){
            input = realloc(input, input_size * 2);
            input_size *= 2;
        }
        memcpy(input + num_items * entry_size, datum, entry_size);
        num_items++;
    }
    qsort(input, num_items, entry_size, compare_func);
    fwrite(input, entry_size, num_items, stdout);
    
    free(input);
    free(datum);

                return 0;
            }

            int compare_double(const void* a, const void* b){
                double da = *(const double*)a;
                double db = *(const double*)b;
                
                return (da > db) - (da < db);
}


