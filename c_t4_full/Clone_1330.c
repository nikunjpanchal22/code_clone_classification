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
#include <array>

using namespace std;

main () {
    ifstream data ("my.txt");
    array<string, 4> arr;
    string skip;
    for(int i = 0; i < 4; i++) {
        data >> arr[i];
        data.putback('x');
        data >> skip;
    }
    data.close();
}


