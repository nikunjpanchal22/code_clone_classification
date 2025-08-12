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





#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

typedef struct {
            unsigned int id;
            char name[50];
        } Primitive;

        int compare_primitive_names(const void* a, const void* b) {
            return strcmp(((Primitive*)a)->name, ((Primitive*)b)->name);
        }

        int compare_primitive_ids(const void* a, const void* b) {
            return (int)(((Primitive*)a)->id - ((Primitive*)b)->id);
        }

        void sort_primitive(Primitive* data, unsigned int length, size_t size, int (*cmp)(const void*, const void*)) {
            qsort(data, length, size, cmp);
        }

        int main() {
            const unsigned int N = 50;
            Primitive* data = (Primitive*) malloc(N * sizeof(*data));

            srand((unsigned int) time(NULL));

            for (unsigned int i = 0; i < N; i++) {
                data[i].id = i + 1;
                sprintf(data[i].name, "String%.3d", 1 + rand() % 999);
            }

            sort_primitive(data, N, sizeof(data[0]), compare_primitive_names);
            for (unsigned int i = 0; i < N; i++)
                printf("%s : %u\n", data[i].name, data[i].id);

            sort_primitive(data, N, sizeof(data[0]), compare_primitive_ids);
            for (unsigned int i = 0; i < N; i++)
                printf("%s : %u\n", data[i].name, data[i].id);

            free(data);

            return 0;
}


