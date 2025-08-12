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
#include <list>

using namespace std;

main () {
    ifstream myFile ("my.txt");
    list<string> arr;
    string skip;
    for(int i=0;i<4;i++) {
        string str;
        myFile >> str;
        arr.push_back(str);
        myFile.putback('x');
        myFile >> skip;
    }
    myFile.close();
}


