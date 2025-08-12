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
    float resizeRatio, sourceRatio;
		float resizeRatioWidth, resizeRatioHeight;
    sourceRatio = (float) source.Width / (float) source.Height;
		
		if (sourceRatio >= 1.0f) {
        resizeRatioWidth = destinationBounds.Width / sourceBounds.Width;
        resizeRatioHeight = sourceBounds.Height / sourceBounds.Height;
				float scaleWidth = destinationBounds.Width;
        float scaleHeight = sourceBounds.Height * resizeRatioWidth;
        float positionX = (destinationBounds.Width - scaleWidth) / 2.0f;
				float positionY = (destinationBounds.Height - scaleHeight) / 2.0f;
        graph.DrawImage (source, positionX, positionY, scaleWidth, scaleHeight);
    } else {
        resizeRatioWidth = destinationBounds.Height / sourceBounds.Height;
        resizeRatioHeight = sourceBounds.Width / sourceBounds.Width;
        float scaleWidth = sourceBounds.Width * resizeRatioWidth;
        float scaleHeight = destinationBounds.Height;
				float positionX = (destinationBounds.Width - scaleWidth) / 2.0f;
				float positionY = (destinationBounds.Height - scaleHeight) / 2.0f;
        graph.DrawImage (source, positionX, positionY, scaleWidth, destinationBounds.Height);
    }
		graph.InterpolationMode = System.Drawing.Drawing2D.InterpolationMode.HighQualityBicubic;
    graph.FillRectangle (new SolidBrush (System.Drawing.Color.White), destinationBounds);
    return destinationImage;
}


