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


 int main(){
   char s1[]="oppa", s2[]="gangnam", s3[]="style";
   char result[]="\0"; 
   if(sizeof(result)+sizeof(s1)+sizeof(s2)+sizeof(s3)<=STR_SIZE){
      for(int i=0;i<sizeof(s1); i++){
         result[i]=s1[i]; 
      }
      for(int j=0;j<sizeof(s2); j++){
         result[sizeof(s1)+j]=s2[j]; 
      }
      for(int k=0;k<sizeof(s3); k++){
         result[sizeof(s2)+k]=s3[k]; 
      }
   }
   printf("%s\n", result); 
}


