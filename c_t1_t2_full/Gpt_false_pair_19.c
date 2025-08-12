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
  int i = 2, result = 0, fparc1 = 1, fparc2 = 0; 
 
  printf("The Fibonacci number is %d\n", result+1); 
  result = fparc1 + fparc2; 
  do 
  { 
    printf("The %2dst Fibonacci number is %3d\n", i, result); 
    fparc2 = fparc1; 
    fparc1 = result; 
    i++; 
  }while((result = fparc1 + fparc2) < 100); 
  return 0; 
}
