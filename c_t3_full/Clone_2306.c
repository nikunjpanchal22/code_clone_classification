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
    char *port1, *port2;
    port1 = strdup (getenv ("PORT_ID"));
    port2 = strdup (getenv ("PORT_ID"));
    port1 = realloc (port1, strlen (port1) +strlen ("S") + 1);
    port2 = realloc (port2, strlen (port2) +strlen ("T") + 1);
    strcat (port1, "S");
    strcat (port2, "T");
}


