private static void getDiscount (int [] items, int [] discount, ref int itemsbought, ref int discountItem) {
    for (int i = 0; itemsbought > items [i];) {
        discountItem = discount [i];
        i ++;
        if (i >= items.Length)
            break;
    }
}


 private static void getDiscount(int[] items, int[] discount, ref int itemsBought, ref int discountItem)
{
	int index = 0;

	while(true)
	{
		if (itemsBought > items[index] && index < items.Length - 1)
		{
			discountItem = discount[index++];
		}
		else
		{
			break;
		}
	}
}


