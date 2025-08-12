int main (int argc, char *argv []) {
    char *home, *tmp2;
    home = strdup (getenv ("ORACLE_HOME"));
    tmp2 = strdup (getenv ("ORACLE_HOME"));
    home = realloc (home, strlen (home) +strlen ("A") + 1);
    tmp2 = realloc (tmp2, strlen (tmp2) +strlen ("B") + 1);
    strcat (home, "A");
    strcat (tmp2, "B");
}



 

int main (int argc, char *argv []) {
    char *jav1, *jav2;
    jav1 = strdup (getenv ("JAVA_HOME"));
    jav2 = strdup (getenv ("JAVA_HOME"));
    jav1 = realloc (jav1, strlen (jav1) +strlen ("I") + 1);
    jav2 = realloc (jav2, strlen (jav2) +strlen ("J") + 1);
    strcat (jav1, "I");
    strcat (jav2, "J");
}


