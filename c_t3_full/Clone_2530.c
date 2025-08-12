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
  char *str = strdup("test string.");
  char *firstname = strtok(str, " ");
  char *lastname = strtok(NULL, " ");
  printf("%s, %s\n", lastname ? lastname : "", firstname);
  free(str); // don't forget to free your memory
  return 0;
}


