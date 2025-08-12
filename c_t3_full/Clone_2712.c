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
    int arr[100], distinct[100], n, j = 0;
    bool checked[1000001] = {false};

    printf("Number: ");
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        printf ("arr[%d]= ", i);
        scanf("%d", &arr[i]);
        if (!checked[arr[i]]) {
            checked[arr[i]] = true;
            distinct[j++] = arr[i];
        }
    }
    printf("Distinct: \n");
    for (int i = 0; i < j; i++)
        printf("%d\n", distinct[i]);
    return 0;
}


