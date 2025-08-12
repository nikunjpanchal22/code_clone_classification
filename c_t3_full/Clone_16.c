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
  int i=2;  
  int result=0; 
  int partialone=1; 
  int partialtwo=0;

  printf("The %2dst Fibonacci number is %3d\n", i-1, result+1);
  result=partialone+partialtwo; 
 
  do{  
    printf("The %2dst Fibonacci number is %3d\n", i, result);
    partialtwo=partialone;  
    partialone=result; 
    i++; 
  }while((result=partialone+partialtwo)<=100); 

  return 0;
}


