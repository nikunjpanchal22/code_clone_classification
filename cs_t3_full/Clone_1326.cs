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


  private void SetBitmapResourcesTransparent () {
    System.Drawing.Image img;
    ImageSource source;
    BitmapSource bmpSource;
    System.Drawing.Bitmap bmp;
    foreach (ResourceDictionary resdict in Application.Current.Resources.MergedDictionaries) {
        foreach (DictionaryEntry dictEntry in resdict) {
            if ((img = dictEntry.Value as System.Drawing.Image) is System.Drawing.Image && (source = System.Windows.Interop.Imaging.CreateBitmapSourceFromHBitmap (img.GetHbitmap (), IntPtr.Zero, Int32Rect.Empty, BitmapSizeOptions.FromEmptyOptions ())) is ImageSource && (bmpSource = source as BitmapSource) is BitmapSource && (bmp = BitmapFromSource (bmpSource)) != null) {
                bmp.MakeTransparent (System.Drawing.Color.Magenta);
                bmpSource = ConvertBitmap (bmp);
                source = bmpSource;
                img.Source = source;
            }
        }
    }
}


