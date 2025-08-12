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
   char** s = (char**) malloc(1000*sizeof(char*));
   char tmpstr[1000];
   int i = 0;
   
   while (1) {
      if (!fgets(tmpstr, 1000, stdin)) {
         break;
      }
      s[i++] = strdup(tmpstr);      
   }
   
   return 0;
}


