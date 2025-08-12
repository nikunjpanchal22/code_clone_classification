private void SetBitmapResourcesTransparent () {
    Image img;
    BitmapSource bmpSource;
    System.Drawing.Bitmap bmp;
    foreach (ResourceDictionary resdict in Application.Current.Resources.MergedDictionaries) {
        foreach (DictionaryEntry dictEntry in resdict) {
            if ((img = dictEntry.Value as Image) is Image && (bmpSource = img.Source as BitmapSource) is BitmapSource && (bmp = BitmapFromSource (bmpSource)) != null) {
                bmp.MakeTransparent (System.Drawing.Color.Magenta);
                bmpSource = ConvertBitmap (bmp);
                img.Source = bmpSource;
            }
        }
    }
}


private void SetBitmapResourcesTransparent() 
{
    Image img;
    BitmapSource bmpSource;
    System.Drawing.Bitmap bmp;
    foreach (ResourceDictionary resdict in Application.Current.Resources.MergedDictionaries)
    {
        foreach (DictionaryEntry dictEntry in resdict) 
        {
            if ((img = dictEntry.Value as Image) is Image && (bmpSource = img.Source as BitmapSource) is BitmapSource && (bmp = BitmapFromSource(bmpSource)) != null) 
            {
                bmp.MakeTransparent(System.Drawing.Color.Green);
                bmpSource = ConvertBitmap(bmp);
                img.Source = bmpSource;
            }
        }
    }
}
