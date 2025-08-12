public Image ResizeImage (Image source, RectangleF destinationBounds) {
    RectangleF sourceBounds = new RectangleF (0.0f, 0.0f, (float) source.Width, (float) source.Height);
    RectangleF scaleBounds = new RectangleF ();
    Image destinationImage = new Bitmap ((int) destinationBounds.Width, (int) destinationBounds.Height);
    Graphics graph = Graphics.FromImage (destinationImage);
    graph.InterpolationMode = System.Drawing.Drawing2D.InterpolationMode.HighQualityBicubic;
    graph.FillRectangle (new SolidBrush (System.Drawing.Color.White), destinationBounds);
    float resizeRatio, sourceRatio;
    float scaleWidth, scaleHeight;
    sourceRatio = (float) source.Width / (float) source.Height;
    if (sourceRatio >= 1.0f) {
        resizeRatio = destinationBounds.Width / sourceBounds.Width;
        scaleWidth = destinationBounds.Width;
        scaleHeight = sourceBounds.Height * resizeRatio;
        float trimValue = destinationBounds.Height - scaleHeight;
        graph.DrawImage (source, 0, (trimValue / 2), destinationBounds.Width, scaleHeight);
    } else {
        resizeRatio = destinationBounds.Height / sourceBounds.Height;
        scaleWidth = sourceBounds.Width * resizeRatio;
        scaleHeight = destinationBounds.Height;
        float trimValue = destinationBounds.Width - scaleWidth;
        graph.DrawImage (source, (trimValue / 2), 0, scaleWidth, destinationBounds.Height);
    }
    return destinationImage;
}


 public Image ResizeImage (Image source, RectangleF destinationBounds) {
    RectangleF sourceBounds = new RectangleF (0.0f, 0.0f, (float) source.Width, (float) source.Height);
    RectangleF scaleBounds = new RectangleF ();
    Image destinationImage = new Bitmap ((int) destinationBounds.Width, (int) destinationBounds.Height);
    Graphics graph = Graphics.FromImage (destinationImage);
    graph.InterpolationMode = System.Drawing.Drawing2D.InterpolationMode.HighQualityBicubic;
    graph.FillRectangle (new SolidBrush (System.Drawing.Color.White), destinationBounds);
    float resizeRatio, sourceRatio;
    float scaleX, scaleY;
    sourceRatio = (float) source.Width / (float) source.Height;
    if (sourceRatio >= 1.0f) {
        scaleX = destinationBounds.Width / sourceBounds.Width;
        scaleY = destinationBounds.Height / sourceBounds.Height;
        resizeRatio = Math.Min(scaleX, scaleY);
        scaleX = sourceBounds.Width * resizeRatio;
        scaleY = sourceBounds.Height * resizeRatio;
        float trimValue = destinationBounds.Width - scaleX;
        graph.DrawImage (source, trimValue/2,0, scaleX, scaleY );
    } else {
        scaleX = destinationBounds.Width / sourceBounds.Width;
        scaleY = destinationBounds.Height / sourceBounds.Height;
        resizeRatio = Math.Min(scaleX, scaleY);
        scaleX = sourceBounds.Width * resizeRatio;
        scaleY = sourceBounds.Height * resizeRatio;
        float trimValue = destinationBounds.Height - scaleY;
        graph.DrawImage (source, 0, trimValue/2 , scaleX, scaleY); 
    }
    return destinationImage;
}


