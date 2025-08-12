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
        string base64ImageRep =  (string) value;
        byte[] imageBytes = Convert.FromBase64String(base64ImageRep);
        var ims = new InMemoryRandomAccessStream();
        var dataWriter = new DataWriter(ims);
        dataWriter.WriteBytes(imageBytes);
        dataWriter.StoreAsync();
        ims.Seek(0);
        BitmapImage image = new BitmapImage();
        image.SetSource(ims);
        return image;
    }
    return null;
}
