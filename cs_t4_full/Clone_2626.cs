private static void getDiscount (int [] items, int [] discount, ref int itemsbought, ref int discountItem) {
    for (int i = 0; itemsbought > items [i];) {
        discountItem = discount [i];
        i ++;
        if (i >= items.Length)
            break;
    }
}





private static void getDiscount (int [] items, int [] discount, ref int itemsbought, ref int discountItem) {
    int i = 0;
    while (items[i] < itemsbought && ++i < items.Length)
        discountItem = discount[i];
}


