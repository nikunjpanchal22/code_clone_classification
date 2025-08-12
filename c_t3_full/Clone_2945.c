int main () {
    int a = 548763, i = 0;
    char str [20] = "";
    int b = a;
    while (b >= 10) {
        b = b / 10;
        i++;
    }
    str[i + 1] = '\0';
    while (i >= 0) {
        str[i] = a % 10 + 48;
        a = a / 10;
        i--;
    }
    printf ("the value of str is \"%s\"", str);
    return 0;
}





#include <stdio.h> 
int main () { 
    int figure = 548763, cursor = 0; 
    char text [20] = ""; 
    while (figure > 10) { 
        figure /= 10; 
        ++cursor; 
    } 
    text[cursor + 1] = '\0'; 
    do { 
        text[cursor] = figure % 10 + 48; 
        figure /= 10; 
        --cursor; 
    } while (cursor >= 0); 
    printf ("the value of text is \"%s\"", text); 
    return 0; 
} 


