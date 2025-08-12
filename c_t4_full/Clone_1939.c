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
  char *delimiter = " ";
  char *firstname = strtok(str, delimiter);
  char *lastname = strtok(NULL, delimiter);
  printf("%s, %s\n", lastname ? lastname : "", firstname);
  return 0;
}


