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
        byte[] bytes = Convert.FromBase64String(value.ToString()); 
        InMemoryRandomAccessStream ms = new InMemoryRandomAccessStream(); 
        using (DataWriter writer = new DataWriter(ms.GetOutputStreamAt(0))) 
        { 
            writer.WriteBytes(bytes); 
            writer.StoreAsync().GetResults(); 
            ms.FlushAsync().GetResults(); 
        } 
        BitmapImage image = new BitmapImage(); 
        image.SetSource(ms); 
        return image; 
    } 
    return null; 
}


