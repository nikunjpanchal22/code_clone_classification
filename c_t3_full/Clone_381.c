int main () {
    char *number = "5.53 garbanzo beans";
    char *foo;
    double d = strtod (number, &foo);
    if (foo == number) {
        printf ("invalid number.");
    }
    else if (foo[strspn (foo, " \t\r\n")] != '\0') {
        printf ("invalid (non-white-space) trailing characters.");
    }
    else {
        printf ("valid number: %lf", d);
    }
}


 int main() { 
    char *number = "5.53 garbanzo beans"; 
    double d; 
    char *foo;
    char *p = number; 
    d = strtod(p, &foo); 
    if (p == foo) { 
        printf ("invalid number.");
    }
    else if (strspn(foo, " \t\r\n") == strlen(foo)){
        printf ("valid number: %lf", d);
    } 
    else {
        printf ("invalid (non-white-space) trailing characters.");
    }
}


