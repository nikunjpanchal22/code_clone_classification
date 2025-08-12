int main () {
    char *arr [20];
    int i, j;
    int size;
    char *revarr [20];
    printf (" enter the number of words\n");
    scanf ("%d", & size);
    for (i = 0; i < size; i++) {
        arr[i] = malloc (100);
        scanf ("%s", arr [i]);
    }
    for (i = 0; i < size; i++) {
        revarr[i] = arr[size - 1 - i];
    }
    printf (" the reversed sentence is: ");
    for (i = 0; i < size; i++) {
        printf ("%s ", revarr [i]);
    }
    printf ("\n");
    for (i = 0; i < size; i++) {
        free (arr [i]);
    }
    return 0;
}


 
int main(){
    char *arr[20];
    int i, j, k;
    int size;
    printf(" enter the number of words\n");
    scanf("%d",&size);
    for(i=0;i<size;i++){
        arr[i] = (char*)malloc(100 * sizeof(char));
        scanf("%s", arr[i]);
    }
    j=0;
    k=size-1;
    while(j < k){
        char temp[20];
        strcpy(temp,arr[k]);
        strcpy(arr[k],arr[j]);
        strcpy(arr[j],temp);
        j++;
        k--;
    }
    printf(" the reversed sentence is: ");
    for(i=0;i<size;i++){
        printf("%s ",arr[i]);
    }
    printf("\n");
    for(i=0;i<size;i++){
        free(arr[i]);
    }
    return 0;
}


