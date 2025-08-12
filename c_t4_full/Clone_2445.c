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
#include <time.h>

typedef struct Entity {
            char name[50];
            unsigned int id;
        } Entity;

        int compare_entity_names(const void* a, const void* b){
            return strcmp(((Entity *)a)->name,((Entity *)b)->name);
        }

        int compare_entity_ids(const void* a, const void* b) {
            return (((Entity *)a)->id - ((Entity *)b)->id);
        }

        void quicksort(record* data, size_t total, size_t size, int (*cmp)(const void*, const void*)) {
            qsort(data, total, size, cmp);
        }

        int main() {
            size_t N = 50;
            Entity* data = (Entity*) calloc(N, sizeof(*data));

            srand(time(0));

            for(size_t i = 0; i < N; i++) {
                data[i].id = i + 1;
                snprintf(data[i].name, sizeof(data[i].name), "String%.3d",(rand()%899)+100);
            }

            quicksort(data, N, sizeof(data[0]), compare_entity_names);

            for(size_t i = 0; i < N; i++)
                printf("%s : %u\n", data[i].name, data[i].id);

            quicksort(data, N, sizeof(data[0]), compare_entity_ids);

            for(size_t i = 0; i < N; i++)
                printf("%s : %u\n", data[i].name, data[i].id);

            free(data);

            return 0;
}


