int main () {
    int a [] = {10, 2, 6, 3, 5, 9, 8, 4, 7};
    int l = sizeof a / sizeof a[0];
    int i, j;
    int check = 1;
    for (i = 0; i < l; i++) {
        check = 1;
        for (j = i + 1; j < l; j++) {
            if (a[i] >= a[j]) {
                check = 0;
            }
        }
        if (check)
            printf ("%d", a[i]);
    }
    printf ("\n");
    return 0;
}


 
int main () {
    int a [] = {10, 2, 6, 3, 5, 9, 8, 4, 7};
    int l = sizeof a / sizeof a[0];
    int i, j;
    int flag = 0;
    for (i = 0; i < l; i++) {
        flag = 0;
        for(j = 0; j < l; j++){
            if (a[i] > a[j]){
                flag = 1;
            }
        }
        if(flag){
            printf("%d ", a[i]);
        }
    }
    printf("\n");
    return 0;
}
