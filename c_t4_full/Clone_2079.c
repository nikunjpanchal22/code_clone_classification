int main () {
    int a, b;
    a = 10;
    b = 10;
    char str1 [10], str2 [10];
    char progCmdline [100];
    sprintf (str1, " %d", a);
    sprintf (str2, " %d", b);
    strcpy (progCmdline, "subprogram.exe ");
    strcat (progCmdline, str1);
    strcat (prog, str2);
    system (progCmdline);
}



 

#include <stdio.h>
#include <stdlib.h>
int main() {
    int a=10, b=10;
    system(("subprogram.exe " + std::to_string(a) + " "+ std::to_string(b)).c_str());
}


