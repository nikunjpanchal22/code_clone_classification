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
	int itemsIndex = 0;
	while (itemsIndex < items.Length)
	{
		if (itemsBought > items[itemsIndex])
		{
			discountItem = discount[itemsIndex];
			itemsIndex++;
		}
		else
		{
			break;
		}
	}
}


