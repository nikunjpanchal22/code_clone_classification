int main () {
    char s1 [] = "oppa";
    char s2 [] = "gangnam";
    char s3 [] = "style";
    {
        char result [STR_SIZE] = {0};
        snprintf (result, sizeof (result), "%s %s %s", s1, s2, s3);
        printf ("%s\n", result);
    }
}


 int main() {
   char s1[] = "oppa"; 
   char s2[] = "gangnam"; 
   char s3[] = "style"; 
   char result[STR_SIZE] = {0};
   int i = 0;
   int j = 0;
   while(i < strlen(s1)){
      result[i] = s1[i];
      i++;
   }
   while(j < strlen(s2)){
      result[i+j] = s2[j];
      j++;
   }
   j=0;
   while(j < strlen(s3)){
      result[i+j] = s3[j];
      j++;
   }
   printf("%s\n", result);
}


