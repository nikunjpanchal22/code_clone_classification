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
  int fib = 0; 
  int part1 = 1; 
  int part2 = 0;
 
  printf("The %2dst Fibonacci number is %3d\n", i-1, fib+1); 
  fib = part1 + part2; 
  do 
  { 
    printf("The %2dst Fibonacci number is %3d\n", i, fib); 
    part2 = part1; 
    part1 = fib; 
    i++; 
  }while((fib = part1 + part2) < 100); 
  return 0; 
}


