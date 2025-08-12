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
    int size = SIZEOF_ARRAY(numbers);
    int temp[size] = {0};
    
    for(int i = 0; i < size -1; i++) {
        for(int j = i+1; j<size; j++) {
            if(numbers[i] == numbers[j]) {
                temp[numbers[i]]++;
            }
        if(temp[numbers[i]] > 0)
            printf("Number %d has duplicate value\n", numbers[i]);
        temp[numbers[i]]++;
        }
    }
}


