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
    int variables[100], number;
    bool verification[1000001] = {false};
    printf("n= ");
    scanf("%d", &number);
    int counter = 0;
    for (int iterator = 0; iterator < number; iterator++) {
        printf("variables[%d]= ", iterator);
        scanf("%d", &variables[iterator]);
        if (verification[variables[iterator]] == false) {
            verification[variables[iterator]] = true;
            variables[counter] = variables[iterator];
            counter++;
        }
    }
    printf("The distinct elements are: \n");
    for (int iterator = 0; iterator < counter; iterator++)
        printf("%d\n", variables[iterator]);
    return 0;
}


