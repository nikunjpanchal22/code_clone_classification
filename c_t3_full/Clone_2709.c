int main () {
    int v [100], w [100], n, i;
    bool check [1000001];
    printf ("n= ");
    scanf ("%d", & n);
    int j = 0;
    for (i = 0; i < n; i++) {
        printf ("v[%d]= ", i);
        scanf ("%d", & v [i]);
        if (!check[v[i]]) {
            check[v[i]] = true;
            w[j] = v[i];
            j++;
        }
    }
    printf ("the distinct elements are: \n");
    for (i = 0; i < j; i++)
        printf ("%d\n", w[i]);
    return 0;
}




#include <stdio.h>
#include <stdbool.h>

int main() {
    int vars[100], unique[100], n;
    bool check[1000001] = {false};
    printf("n= ");
    scanf("%d", &n);
    int counter = 0;
    for (int i = 0; i < n; i++) {
        printf("vars[%d]= ", i);
        scanf("%d", &vars[i]);
        if (!check[vars[i]]) {
            check[vars[i]] = true;
            unique[counter++] = vars[i];
        }
    }
    printf("Distinct elements: \n");
    for (int i = 0; i < counter; i++)
        printf("%d\n", unique[i]);
    return 0;
}


