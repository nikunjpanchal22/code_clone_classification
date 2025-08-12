int main () {
    char str [] = "test string.";
    char *firstname = strtok (str, " ");
    char *lastname = strtok (NULL, " ");
    if (!lastname)
        lastname = "";
    printf ("%s, %s\n", lastname, firstname);
    return 0;
}




#define EMPTY_STRING ""

int main() {
  char str[] = "test string.";
  char *firstname = strtok(str, " ");
  char *lastname = strtok(NULL, " ");
  printf("%s, %s\n", lastname ? lastname : EMPTY_STRING, firstname);
  return 0;
}


