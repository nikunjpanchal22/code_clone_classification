int main () {
    int Sum [12] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    int Choice;
    printf ("Pick Your Time's Table\n");
    printf ("|2|3|4|5|6|7|8|9|10|11|12|\n");
    printf ("===========================\n");
    scanf ("%d", & Choice);
    int i;
    for (i = 0; i < 12; i++) {
        printf ("%d X %d = %d\n", Choice, Sum [i], Choice * Sum [i]);
    }
    return 0;
}





#include<iostream>
using namespace std;
int main(){
int array[12]={1,2,3,4,5,6,7,8,9,10,11,12},value,i;
cout<<"Which table would you like? "<<"\n";
cin>>value;
for(i=0;i<12;i++)
cout<<value<<"*"<< array[i]<<"="<<value*array[i]<<"\n";
}


