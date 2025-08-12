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

    for(i=0; i<l-1; i++){
        int flag = 0;
        for(j=i+1; j<l; j++){
            if (a[i] >= a[j])
                flag = 1;
        }
        if(flag == 0){
            printf("%d\t", a[i]);
        }
    }
    printf("%d\n", a[l-1]);
    return 0;
}


