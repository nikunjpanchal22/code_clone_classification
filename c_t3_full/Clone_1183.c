int main () {
    char **s = (char **) malloc (1000 * sizeof (char *));
    char tmpstr [1000];
    int i;
    while (-1 != getline (tmpstr)) {
        s[i++] = strdup (tmpstr);
    }
    return 0;
}


 int main () {
   char** s = (char**) malloc(1000 * sizeof(char*));
   char tmpstr[1000];
   int i = 0;
   
   FILE *fp = fopen("input.txt", "r");  
   if (fp) {
      while(fgets(tmpstr, 1000, fp)) {
         s[i++] = strdup(tmpstr);
      }
   }
   fclose(fp);
   
   return 0;
}


