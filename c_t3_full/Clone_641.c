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
    Array *negativeTest, *days = MakeArray(5); 
    double moreDays[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
  
    for (i = 0; i < days->length; i++) 
        days->array[i] = i + 1; 
  
    PrintArray(days); 
    SetArray(days, 10, moreDays); 
    PrintArray(days); 
    negativeTest = MakeArray(-5); 
    PrintArray(negativeTest); 
  
    for (i = 0; i < days->length; i++) 
        free(days->array[i]); 
    free(days->array); 
    free(days); 
  
    return 0; 
}


