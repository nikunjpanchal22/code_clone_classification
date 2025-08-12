int main () {
    int num, s, i, cnt = 0;
    printf ("please input number of integers and int to compare with\n");
    scanf ("%d %d", & s, & num);
    int arr [s];
    for (i = 0; i < s; i++) {
        printf ("Please input %d. number", i + 1);
        scanf ("%d", & arr [i]);
    }
    for (i = 0; i < s; i++) {
        if (arr[i] >= num)
            cnt++;
    }
    return 0;
}



#5

#include <stdio.h>
int main() {
    int dim, ref;
    printf("Enter dim and reference num: ");
    scanf("%d %d", &dim, &ref);
    int arr[dim];
    for(int i = 0; i < dim; i++) {
        printf("Enter %d. number: ", i+1);
        scanf("%d", &arr[i]);
    }
    int count = 0;
    for(int i = 0; i < dim; i++) 
        if(arr[i] >= ref) count++;
    return 0;    
}


