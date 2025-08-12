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





#include <iostream>
#define run system
int main(){
    run(R"(subprogram.exe 10 10)");
}


