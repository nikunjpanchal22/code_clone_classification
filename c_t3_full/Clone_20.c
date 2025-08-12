int main () {
    int i = 2, fibonacci = 0, fParcialone = 1, fParcialtwo = 0;
    printf ("The %2dst Fibonacci number is %3d\n", i - 1, fibonacci + 1);
    fibonacci = fParcialone + fParcialtwo;
    do {
        printf ("The %2dst Fibonacci number is %3d\n", i, fibonacci);
        fParcialtwo = fParcialone;
        fParcialone = fibonacci;
        i++;
    }
    while ((fibonacci = fParcialone + fParcialtwo) <= 100);
    return 0;
}


 int main() 
{ 
  int i = 2; 
  int result = 0;
  int fpart1 = 1; 
  int fpart2 = 0;
 
  printf("The %2dst Fibonacci number is %3d\n", i-1, result+1); 
  result = fpart1 + fpart2; 
  
  do{ 
    printf("The %2dst Fibonacci number is %3d\n", i, result); 
    fpart2 = fpart1; 
    fpart1 = result;  
    i++; 
  }while((result = fpart1 + fpart2) < 100); 
  
  return 0; 
} 


