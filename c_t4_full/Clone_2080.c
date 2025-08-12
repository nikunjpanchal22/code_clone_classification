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



 

#include<stdlib.h>
#include<stdio.h>
#define ADD(x,y) x##y
#define TO_STRING(x) #x

int main(){
    system(ADD(TO_STRING(subprogram.exe ), ADD(TO_STRING(10), ADD(TO_STRING(10), ""))));
}


