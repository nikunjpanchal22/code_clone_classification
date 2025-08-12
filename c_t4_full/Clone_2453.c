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

struct node {
            char name[50];
            unsigned int id;
        };

        int compare_node_name(const void* a, const void* b){
            return strcmp(((struct node *)a)->name,((struct node *)b)->name);
        }

        int compare_node_identity(const void* a, const void* b) {
            return (((struct node *)a)->id - ((struct node *)b)->id);
        }

        void sort_by(node* data, unsigned int n, size_t size, int (*cmp)(const void*, const void*)) {
            qsort(data, n, size, cmp);
        }

        int main() {
            static const unsigned int N = 50;
            struct node *data = malloc(N * sizeof(*data));

            srand((unsigned) time(NULL));

            for(int i = 0; i < N; i++) {
                data[i].id = i + 1;
                snprintf(data[i].name, sizeof(data[i].name), "String%.3d",(rand()%899)+100);
            }

            sort_by(data, N, sizeof(data[0]), compare_node_name);

            for(int i = 0; i < N; i++)
                printf("%s : %u\n", data[i].name, data[i].id);

            sort_by(data, N, sizeof (data[0]), compare_node_identity);

            for(int i = 0; i < N; i++)
                printf("%s : %u\n", data[i].name, data[i].id);

            free(data);

            return 0;
}


