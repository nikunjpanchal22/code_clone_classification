int main () {
    int width;
    int breadth;
    scanf ("%d", & width);
    scanf ("%d", & breadth);
    if (width == 1 && breadth == 1) {
        printf ("#\n");
    }
    else {
        for (int i = 0; i < breadth; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || j == 0)
                    printf ("#");
                else if (i == (breadth - 1) || j == (width - 1))
                    printf ("#");
                else
                    printf (".");
            }
            printf ("\n");
        }
    }
    return 0;
}





#include <iostream>
using namespace std;

int main () {
    int width, breadth;
    cin >> width >> breadth;
    string res(width*breadth, '.'), line(width, '#');
    for(int i=0; i<=breadth-1; i+=breadth-1)
        res.replace(i*width, width, line);
    for(int i=0; i<breadth; i++)
        for(int j=0; j<=width-1; j+=width-1)
            res[i*width+j] = '#';
    if(res.size() == 1) res[0] = '#';
    cout << res;
    return 0;
}


