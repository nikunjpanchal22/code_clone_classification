int main () {
    int i;
    Array *negativeTest, *days = NewArray (5);
    double moreDays [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    for (i = 0; i < days->length; i++)
        days->array[i] = i + 1;
    PrintArray (days);
    SetArray (days, 10, moreDays);
    PrintArray (days);
    negativeTest = NewArray (-5);
    PrintArray (negativeTest);
    return 0;
}



 
int main() 
{ 
    int i; 
    Array *negativeTest, *days = CreateArray(5); 
    double moreDays[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
  
    for (i = 0; i < days->length; i++) 
        days->array[i] = i + 1; 
  
    PrintArray(days); 
    SetArray(days, 10, moreDays); 
    PrintArray(days); 
    negativeTest = CreateArray(-5); 
    PrintArray(negativeTest); 
  
    free(days->array); 
    free(negativeTest->array);
    free(days);
    free(negativeTest);
  
    return 0; 
} 


