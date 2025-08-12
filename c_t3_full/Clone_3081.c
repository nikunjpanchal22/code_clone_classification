int main (void) {
    int n;
    scanf ("%d", & n);
    a = (int **) malloc (n * sizeof (int *));
    for (int i = 0; i < 5; i++) {
        a[i] = (int *) malloc (n * sizeof (int));
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            scanf ("%d", & a [i] [j]);
        }
    }
    fun (n);
    return 0;
}




#include<iostream>
#include<malloc.h>
#define fun(n) /* Define function implementation */

int main()
{
    int n,**arr;
    scanf("%d",&n);
    arr=(int**)malloc(n*sizeof(int));
    for(int i=0;i<n;i++){
        arr[i]=(int*)malloc(n*sizeof(int));
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            scanf("%d",&arr[i][j]);
        }
    }
    fun(n);
    return 0;
}


