main () {
    int i;
    string array [4];
    FILE *my;
    my = fopen ("my.txt", "r");
    for (i = 0; i < 4; i++) {
        fscanf (data, "%" MAX_CHARS_STR "s", & array [i]);
        ungetc ('x', data);
        fscanf (data, "%*s");
    }
    fclose (my);
}





#include <stdio.h>
#include <stack>

using namespace std;

main () {
    fstream my ("my.txt");
    stack<string> arr;
    string skip;
    for(int i=0;i<4;i++) {
        string str;
        my >> str;
        arr.push(str);
        my.putback('x');
        my >> skip;
    }
    my.close();
}


