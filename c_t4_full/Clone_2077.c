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
#include <string.h>
int main() {
    char progCmdLine [100];
    sprintf(progCmdLine, "subprogram.exe %d %d", 10, 10);
    system(progCmdLine);
}


