int main (void) {
    char line [128], *p = line;
    int sum = 0, len, n;
    printf ("enter numbers: ");
    scanf ("%127[^\n]", line);
    while (sscanf (p, "%d%n", &n, &len) == 1) {
        sum += n;
        p += len;
    }
    printf ("sum: %d\n", sum);
    return 0;
}


 int main () {
   char str[128], *p = str;
   int total = 0, size, x;
   printf("Enter numbers: ");
   fgets (str, sizeof str, stdin); 
   while (sscanf (p, "%d%n", &x, &size) == 1) {
      total += x;
      p += size;
   }
   printf("Total: %d\n", total);
   return 0;
}
