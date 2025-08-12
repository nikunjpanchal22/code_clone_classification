int main () {
    char str [] = "ababbababa-1998";
    char * const first_part = strtok (str, "-");
    if (first_part == NULL) {
        return 1;
    }
    char * const second_part = strtok (NULL, "-");
    if (second_part == NULL) {
        return 1;
    }
    int nr = atoi (second_part);
    printf ("%d\n", nr);
    return 0;
}


 int main () {
    char str [] = "ababbababa-1998"; 
    char *delimiter = strchr(str, '-'); //finds character '-' in string
    char *first_part[10]; 
    char *second_part[10]; 
    int nr;
 
    //splitting of string
    strncpy(first_part, str, delimiter-str); 
    first_part[delimiter-str] = 0;
    strcpy(second_part, delimiter+1);
    second_part[strlen(second_part)] = 0;
 
    //converting the extracted string to integer
    nr = atoi(second_part); 
  
    printf("%d\n", nr);
    return 0;
}


