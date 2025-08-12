public object Convert (object value, Type targetType, object parameter, string language) {
    if (value != null) {
        string source = value.ToString ();
        var ims = new InMemoryRandomAccessStream ();
        var bytes = Convert.FromBase64String (source);
        var dataWriter = new DataWriter (ims);
        dataWriter.WriteBytes (bytes);
        dataWriter.StoreAsync ();
        ims.Seek (0);
        var img = new BitmapImage ();
        img.SetSource (ims);
        return img;
    }
    return null;
}


 public object Convert (object value, Type targetType, object parameter, string language) { 
    if (value != null) { 
        byte[] bytes = System.Convert.FromBase64String (value.ToString ()); 
        var img = new BitmapImage (); 
        var ms = new InMemoryRandomAccessStream (); 
        ms.WriteAsync (bytes.AsBuffer ()); 
        ms.FlushAsync ().GetResults (); 
        img.SetSource (ms); 
        return img; 
    } 
    return null;
}


