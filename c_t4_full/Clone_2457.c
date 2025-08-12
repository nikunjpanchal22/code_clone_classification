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
            char name[50];
            unsigned int id;
        } Node;

        int name_compare(const void* a, const void* b) {
            return strcmp(((Node*)a)->name, ((Node*)b)->name);
        }

        int id_compare(const void* a, const void* b) {
            return (((Node*)a)->id - ((Node*)b)->id);
        }

        void sort(Node* data, unsigned int total, size_t size, int (*cmp)(const void*, const void*)) {
            qsort(data, total, size, cmp);
        }

        int main() {
            const unsigned int N = 50;
            Node* data = (Node*) malloc(N * sizeof(*data));

            srand((unsigned int) time(NULL));

            for (unsigned int i = 0; i < N; ++i) {
                data[i].id = i + 1;
                snprintf(data[i].name, sizeof(data[i].name), "String%.3d",(rand()%899)+100);
            }

            sort(data, N, sizeof(data[0]), name_compare);
            
            for (unsigned int i = 0; i < N; ++i)
                printf("%s : %u\n", data[i].name, data[i].id);

            sort(data, N, sizeof(data[0]), id_compare);

            for (unsigned int i = 0; i < N; ++i)
                printf("%s : %u\n", data[i].name, data[i].id);
        
            free(data);
            return 0;
}


