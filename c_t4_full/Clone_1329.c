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
#include <fstream>

using namespace std;

main () {
    fstream my ("my.txt");
    string arr [4];
    string skip;
    for(int i=0;i<4;i++) {
        my>>arr[i];
        my.putback('x');
        my >> skip;
    }
    my.close();
}


