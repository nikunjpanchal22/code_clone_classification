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
            char name[50];
            unsigned int id;
        } node;

        int compare_node_names(const void* a, const void* b){
            return strcmp(((node *)a)->name,((node *)b)->name);
        }

        int compare_node_ids(const void* a, const void* b) {
            return (((node *)a)->id - ((node *)b)->id);
        }

        void mergesort(node* data, unsigned int length, size_t size, int (*cmp)(const void*, const void*)) {
            qsort(data, length, size, cmp);
        }

        int main() {
            static const unsigned int N = 50;
            node* data = (node*) malloc(N * sizeof(*data));
            srand((unsigned int) time(NULL));

            for(int i = 0; i < N; i++) {
                data[i].id = i + 1;
                sprintf(data[i].name, "String%.3d", 1 + rand() % 999);
            }

            mergesort(data, N, sizeof(data[0]), compare_node_names);

            for(int i = 0; i < N; i++)
                printf("%s : %u\n", data[i].name, data[i].id);

            mergesort(data, N, sizeof(data[0]), compare_node_ids);

            for(int i = 0; i < N; i++)
                printf("%s : %u\n", data[i].name, data[i].id);

            printf("\n");

            free(data);

            return 0;
}


