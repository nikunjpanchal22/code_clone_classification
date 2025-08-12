private static void getDiscount (int [] items, int [] discount, ref int itemsbought, ref int discountItem) {
    for (int i = 0; itemsbought > items [i];) {
        discountItem = discount [i];
        i ++;
        if (i >= items.Length)
            break;
    }
}


private static void getDiscount (ref int itemsbought, ref int discountItem, List<int> items, List<int> discount) {
    for (int i = 0; itemsbought > items [i];) {
        discountItem = discount [i];
        i ++;
        if (i >= items.Count)
            break;
    }
}
