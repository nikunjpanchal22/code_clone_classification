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

typedef struct node {
            unsigned int id;
            char name[50];
        } node;

        int compare_name(const void* a, const void* b) {
            return strcmp(((node*)a)->name, ((node*)b)->name);
        }

        int compare_id(const void* a, const void* b) {
            return (((node*)a)->id - ((node*)b)->id);
        }

        void sort(node* data, unsigned int size, size_t element_size, int (*cmp)(const void*, const void*)) {
            qsort(data, size, element_size, cmp);
        }

        int main() {
            static const unsigned int N = 50;
            node* data = (node*) malloc(N * sizeof(*data));
            srand((unsigned int) time(NULL));

            for(int i = 0; i < N; i++) {
                data[i].id = i + 1;
                sprintf(data[i].name, "String%.3d", 1 + rand() % 999);
            }

            sort(data, N, sizeof(data[0]), compare_name);

            for(int i = 0; i < N; i++)
                printf("%s : %u\n", data[i].name, data[i].id);

            sort(data, N, sizeof(data[0]), compare_id);

            for(int i = 0; i < N; i++)
                printf("%s : %u\n", data[i].name, data[i].id);
            
            free(data);

            return 0;
}


