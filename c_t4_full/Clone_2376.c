int main () {
    test (0, 0);
    test (1, 1);
    test (2, 2);
    test (3, 4);
    test (4, 5);
    test (5, 7);
    test (6, 9);
    test (1000000000, 14846928141);
}


 

void test(int a, int b){
   if(a<b) printf("B is greater\n");
   else printf("A is greater or equal\n");
}


