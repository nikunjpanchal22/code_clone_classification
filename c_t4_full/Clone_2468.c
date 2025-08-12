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

struct item {
            unsigned int id;
            char name[50];
        };

        int compare_name(const void* a, const void* b) {
            return strcmp(((struct item*)a)->name, ((struct item*)b)->name);
        }

        int compare_id(const void* a, const void* b) {
            return (((struct item*)a)->id - ((struct item*)b)->id);
        }

        void quick_sort(item* data, unsigned int total, size_t size, int (*cmp)(const void*, const void*)) {
            qsort(data, total, size, cmp);
        }

        int main() {
            const unsigned int N = 50;
            struct item *data = (struct item*) malloc(N * sizeof(*data));
            
            srand((unsigned int) time(NULL));
            
            for (unsigned int i = 0; i != N; ++i) {
                data[i].id = i + 1;
                snprintf(data[i].name, sizeof(data[i].name), "String%.3d",(rand()%899)+100);
            }
            
            quick_sort(data, N, sizeof(data[0]), compare_name);
            
            for (unsigned int i = 0; i != N; i++)
            printf("%s : %u\n", data[i].name, data[i].id);

        quick_sort(data, N, sizeof(data[0]), compare_id);

        for (unsigned int i = 0; i != N; i++)
            printf("%s : %u\n", data[i].name, data[i].id);

        free(data);
        return 0;
}


