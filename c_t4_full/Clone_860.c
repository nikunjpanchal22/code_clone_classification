int main (int argc, char **argv) {
    int tree1 = 14;
    int tree2 = 7;
    int tree3 = 16;
    int limit = 11;
    int cutamounttotal = 0;
    cutamounttotal += CUTAMOUNT (tree1, limit);
    cutamounttotal += CUTAMOUNT (tree2, limit);
    cutamounttotal += CUTAMOUNT (tree3, limit);
    printf ("Amount to remove: %d\n", cutamounttotal);
    return 0;
}





#define CUTAMOUNT(tree, limit)  ((tree>limit)?(tree-limit):0)
#include<iostream>

int main (){
    int cutamounttotal = 0;    
    for(int i : {14, 7, 16})
        cutamounttotal += CUTAMOUNT(i, 11);

    std::cout << "Amount to remove: " << cutamounttotal << std::endl;
    return 0;
}


