int main () {
    int n, c, d, position, swap;
    printf ("Enter number of elements\n");
    scanf ("%d", & n);
    int array [n];
    printf ("Enter %d integers\n", n);
    for (c = 0; c < n; c++)
        scanf ("%d", &array[c]);
    for (c = 0; c < (n - 1); c++) {
        position = c;
        for (d = c + 1; d < n; d++) {
            if (array[position] > array[d])
                position = d;
        }
        if (position != c) {
            swap = array[c];
            array[c] = array[position];
            array[position] = swap;
        }
    }
    printf ("Sorted list in ascending order:\n");
    for (c = 0; c < n; c++)
        printf ("%d\n", array[c]);
    return 0;
}



 

#include<stdio.h>

void main() {
    int a[50], n, i, j, loc, temp;
    printf("Enter the number of elements : ");
    scanf("%d", &n);
    printf("\nEnter elements : ");
    for (i = 0; i < n; i++)
        scanf("%d", &a[i]);
    for(i=0; i<n-1; i++){
        loc = i;        
        for (j = i+1; j < n; j++){
            if (a[loc] > a[j])
                loc = j;
        }
        if(loc != i){
            temp = a[i];
            a[i] = a[loc];
            a[loc]= temp;
        }
    }
    printf("Sorted list : \n");    
    for (i = 0; i < n; i++)
        printf("%d ", a[i]);
}


