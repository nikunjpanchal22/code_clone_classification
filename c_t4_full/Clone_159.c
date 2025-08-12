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
    if (sscanf(number, "%lf%s", &d, foo)) {
        if (strlen(foo) == 0) {
            printf("valid number: %lf", d); 
        }   
        else {
            printf("invalid (non-white-space) trailing characters.");
        }
    } 
    else {
        printf("invalid number.");
    }
} 


