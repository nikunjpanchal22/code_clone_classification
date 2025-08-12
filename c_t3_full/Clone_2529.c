int main () {
    char str [] = "test string.";
    char *firstname = strtok (str, " ");
    char *lastname = strtok (NULL, " ");
    if (!lastname)
        lastname = "";
    printf ("%s, %s\n", lastname, firstname);
    return 0;
}




int main() {
  char str[] = "test string.";
  char *sep = " ";
  char *firstname = strtok(str, sep);
  char *lastname = strtok(NULL, sep);
  lastname = lastname ? lastname : "";
  printf("%s, %s\n", lastname, firstname);
  return 0;
}


