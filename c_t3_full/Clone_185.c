int main (void) {
    int a [100];
    int n, x;
    int i = 0;
    scanf ("%d%d", & n, & x);
    for (i = 0; i < n; i++) {
        scanf ("%d", & a [i]);
    }
    return 0;
}


 int main (void) {
    int array_items [100];
    int length_array, find_item;
    int itemNum = 0;
    printf("Please identify how many items you want to store in array : ");
    scanf ("%d", & length_array);
    printf("Enter %d elements of array : ",length_array);
    scanf ("%d", & find_item);
    for (itemNum = 0; itemNum < length_array; itemNum++) {
        scanf ("%d", & array_items [itemNum]);
    }
    return 0;
}


