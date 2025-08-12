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





#define CUTAMOUNT(t,lim) ((t>lim)?(t-lim):0)

#include<stdio.h>

int main (int argc, char **argv) {
    int cutamounttotal = 0;
    cutamounttotal += CUTAMOUNT (14, 11);
    cutamounttotal += CUTAMOUNT (7, 11);
    cutamounttotal += CUTAMOUNT (16, 11);
    printf ("Amount to remove: %d\n", cutamounttotal);
    return 0;
}


