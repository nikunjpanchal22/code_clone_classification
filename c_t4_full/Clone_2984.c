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






int main () {
    list l;
    TLV *tag;
    unsigned char test_arr[3][4] = {{1,2},{1,2,3},{1,2,3,4}};
    
    if(!listNew (& l, sizeof(TLV *), listFree, Print)){
        printf("List creation failed\n");
        return -1;
    }

    for(int i=0;i<3;i++) {
        tag = allocateTLV(i+2, i+2, test_arr[i]);
        if (tag != NULL) {
            if(!listPushFront (& l, & tag)){
                printf("Push to list failed\n");
                break;
            }
        } else {
            printf("Allocation failed\n");
            break;
        }    
    }

    listPrint (& l);
    listDestroy (& l);
    return 0;
}


