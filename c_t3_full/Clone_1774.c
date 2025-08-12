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


 
int main () {
    char *arr [20];
    int i, j;
    int size;
    char temp[20];
    printf (" enter the number of words\n");
    scanf ("%d", & size);
    for (i = 0; i < size; i++) {
        arr[i] = (char*)malloc (100 * sizeof(char));
        scanf ("%s", arr [i]);
    }
    for (i = 0, j = size-1; i < j; i++, j--)
    { 
        strcpy(temp, arr[j]);
        strcpy(arr[j], arr[i]);
        strcpy(arr[i], temp);
    } 
    printf (" the reversed sentence is: ");
    for (i = 0; i < size; i++) {
        printf ("%s ", arr [i]);
    }
    printf ("\n");
    for (i = 0; i < size; i++) {
        free (arr [i]);
    }
    return 0;
}


