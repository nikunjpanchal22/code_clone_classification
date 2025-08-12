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


 int main (int argc, char **argv) {
    int tree1 = 14;
    int tree2 = 7;
    int tree3 = 16;
    int limit = 11;
    int cutamounttotal = 0;
    int amount1 = 0;
    int amount2 = 0;
    int amount3 = 0;
    amount1 = CUTAMOUNT (tree1, limit);
    amount2 = CUTAMOUNT (tree2, limit);
    amount3 = CUTAMOUNT (tree3, limit); 
    cutamounttotal = amount1 + amount2 + amount3;
    printf ("Amount to remove: %d\n", cutamounttotal);
    return 0;
}


