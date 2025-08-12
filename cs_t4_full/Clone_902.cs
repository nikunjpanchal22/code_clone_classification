private BitmapSource BitmaptoBitmapsource (System.Drawing.Bitmap bitmap) {
    BitmapSource bms;
    IntPtr hBitmap = bitmap.GetHbitmap ();
    BitmapSizeOptions sizeOptions = BitmapSizeOptions.FromEmptyOptions ();
    try {
        bms = System.Windows.Interop.Imaging.CreateBitmapSourceFromHBitmap (hBitmap, IntPtr.Zero, Int32Rect.Empty, sizeOptions);
        bms.Freeze ();
    }
    finally {
        DeleteObject (hBitmap);
    }
    return bms;
}



  private BitmapSource BitmaptoBitmapsource (System.Drawing.Bitmap bitmap) {
    BitmapSource bitmapSource;
    using (MemoryStream ms = new MemoryStream())
    {
        bitmap.Save (ms);
        bitmapSource = BitmapFrame.Create(ms);
        bitmapSource.Freeze();
    }
    return bitmapSource;
}


