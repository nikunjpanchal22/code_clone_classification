int main (void) {
    int numbers [] = {1, 1, 2, 2, 2, 3, 4, 5, 6, 6, 7, 7, 7, 8, 9};
    for (size_t i = 0; i < SIZEOF_ARRAY (numbers) - 1; ++i) {
        if (contains (numbers, i, numbers[i]))
            continue;
        if (contains (numbers +i + 1, SIZEOF_ARRAY (numbers) -i, numbers[i]))
            printf ("Number %d has duplicate values\n", numbers[i]);
    }
}


 int main (void) {
    int numbers [] = {1, 1, 2, 2, 2, 3, 4, 5, 6, 6, 7, 7, 7, 8, 9};
    
    for (size_t i=0; i< SIZEOF_ARRAY(numbers)-1; i++){
        int j = 0;
        if(numbers[i] == numbers[i+j+1]){
            j++;
            printf("Number %d has duplicate values\n", numbers[i]);
        }
    }
    
}


