private static void getDiscount (int [] items, int [] discount, ref int itemsbought, ref int discountItem) {
    for (int i = 0; itemsbought > items [i];) {
        discountItem = discount [i];
        i ++;
        if (i >= items.Length)
            break;
    }
}





private static void getDiscount (int [] items, int [] discount, ref int itemsbought, ref int discountItem){
    int i = 0;
    while(i < items.Length){
        if(itemsbought <= items[i]) return;
        discountItem = discount[i++];
    }
}


