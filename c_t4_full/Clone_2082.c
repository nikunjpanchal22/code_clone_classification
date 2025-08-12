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





#include<stdio.h>
#include<stdlib.h>
#define PROG "subprogram.exe "
#define Stringize(L) #L
#define STR_HELPER(x) #x
#define STR(x) STR_HELPER(x)
#define RUN(x,y) PROG STR(x) " " STR(y)
int main(){
    system(RUN(10,10));
}


