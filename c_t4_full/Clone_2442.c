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





#include<stdio.h>
#include<stdlib.h>
#include<time.h>

typedef struct Node {
            char name[50];
            unsigned int id;
        } Node;

        int compare_names(const void* a, const void* b) {
            return strcmp(((Node*)a)->name, ((Node*)b)->name);
        }

        int compare_ids(const void* a, const void* b) {
            return (((Node*)a)->id - ((Node*)b)->id);
        }

        void custom_sort(Node* data, unsigned int n, size_t size, int (*cmp)(const void*, const void*)) {
            qsort(data, n, size, cmp);
        }

        int main() {
            static const unsigned int N = 50;
            Node* data = (Node*) calloc(N, sizeof(*data));

            srand((unsigned int) time(NULL));

            for(unsigned int i = 0; i < N; i++) {
                data[i].id = i + 1;
                snprintf(data[i].name, sizeof(data[i].name), "String%.3d",1 + rand() % 999);
            }

            custom_sort(data, N, sizeof(data[0]), compare_names);

            for(unsigned int i = 0; i < N; i++)
                printf("%s : %u\n", data[i].name, data[i].id);

            custom_sort(data, N, sizeof(data[0]), compare_ids);

            for(unsigned int i = 0; i < N; i++)
                printf("%s : %u\n",data[i].name, data[i].id);

            free(data);

            return 0;
}


