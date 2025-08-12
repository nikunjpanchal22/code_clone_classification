int main (void) {
    int a [] = {10, 2, 6, 3, -1, 5, 9, 8, 4, 7};
    int i, j, p, n = sizeof (a) / sizeof (a[0]);
    p = a[0];
    i = 0;
    for (j = i + 1; j < n; j++) {
        if (a[j] < p) {
            i = j;
            p = a[i];
        }
    }
    printf ("%d ", p);
    i = find_next (a, n, i +1, p);
    while (i < n) {
        p = a[i];
        printf ("%d ", p);
        i = find_next (a, n, i +1, p);
    }
    printf ("\n");
    return 0;
}


 
int main(void){
    int a[] = {10,2,6,3,-1,5,9,8,4,7};
    int i, j, p, n = sizeof(a) / sizeof(a[0]); 
 
    for(i = 0; i < n; i++){
        j = 0;
        p = a[i];
        while(j < n){
            if(a[j] < p && j > i){
                p = a[j];
            }
            j++;
        }
        printf("%d ", p);
        i = find_next(a, n, i+1, p);
    }
    return 0;
}


