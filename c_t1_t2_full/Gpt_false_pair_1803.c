int main () {
    list l;
    TLV *tag;
    unsigned char test2 [2] = {1, 2};
    unsigned char test3 [3] = {1, 2, 3};
    unsigned char test4 [4] = {1, 2, 3, 4};
    listNew (& l, sizeof (TLV *), listFree, Print);
    tag = allocateTLV (2, sizeof (test2), test2);
    if (tag != NULL) {
        listPushFront (& l, & tag);
    }
    tag = allocateTLV (3, sizeof (test3), test3);
    if (tag != NULL) {
        listPushFront (& l, & tag);
    }
    tag = allocateTLV (4, sizeof (test4), test4);
    if (tag != NULL) {
        listPushFront (& l, & tag);
    }
    listPrint (& l);
    listDestroy (& l);
    return 0;
}


 
int main() 
{ 
    list l; 
    TLV *tag; 
    unsigned char test2[2] = {1, 2}; 
    unsigned char test3[3] = {1, 2, 3}; 
    unsigned char test4[4] = {1, 2, 3, 4}; 
    listNew(&l, sizeof(TLV*), listFree, Print); 
    tag = allocateTLV(2, sizeof(test2), test2); 
    if (tag != NULL) 
    { 
        listPrepend(&l, &tag); 
    } 
    tag = allocateTLV(3, sizeof(test3), test3); 
    if (tag != NULL) 
    { 
        listPrepend(&l, &tag); 
    } 
    tag = allocateTLV(4, sizeof(test4), test4); 
    if (tag != NULL) 
    { 
        listPrepend(&l, &tag); 
    } 
    listPrint(&l); 
    listDestroy(&l); 
    return 0;
}
