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

typedef struct node {
        char name[50];
        unsigned int id;
        } node;

        int compare_node_names (const void *a, const void *b){
        return strcmp(((node *)a)->name,((node *)b)->name);
        }

        int compare_node_ids (const void *a, const void *b) {
        return (((node *)a)->id - ((node *)b)->id);
        }

        void genmsort(node *data, unsigned total, unsigned size, int (*cmp)(const void*, const void*)) {
        qsort(data, total, size, cmp);
        }

        int main () {
        int i = 0;
        const unsigned int N = 50;
        node *data = (node*)malloc (N * sizeof(*data));
        srand ((unsigned int) time(0));
        
        for (; i != N; i++) {
            data[i].id = i + 1;
            snprintf(data[i].name, sizeof(data[i].name), "String%.3d",(rand()%899)+100);
        }
        
        genmsort(data, N, sizeof(data[0]), compare_node_names);
        
        for (i = 0; i != N; i++)
            printf ("%s : %u\n", data[i].name, data[i].id);

        genmsort(data, N, sizeof (data[0]), compare_node_ids);
        
        for(i = 0; i != N; i++)
            printf ("%s : %u\n", data[i].name, data[i].id);
        
        free(data);
        return 0;
}


