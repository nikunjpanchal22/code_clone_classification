public static void FindGoodFont (Graphics Graf, string sStringToFit, Size TextRoomAvail, ref Font FontToUse, GraphicsUnit FontUnit) {
    SizeF RealSize = Graf.MeasureString (sStringToFit, FontToUse);
    Debug.WriteLine ("big string is {0}, orig size = {1},{2}", sStringToFit, RealSize.Width, RealSize.Height);
    if ((RealSize.Width <= TextRoomAvail.Width) && (RealSize.Height <= TextRoomAvail.Height)) {
        Debug.WriteLine ("The space is big enough already");
        return;
    }
    float HeightScaleRatio = TextRoomAvail.Height / RealSize.Height;
    float WidthScaleRatio = TextRoomAvail.Width / RealSize.Width;
    float ScaleRatio = (HeightScaleRatio < WidthScaleRatio) ? ScaleRatio = HeightScaleRatio : ScaleRatio = WidthScaleRatio;
    float ScaleFontSize = FontToUse.Size * ScaleRatio;
    Debug.WriteLine ("Resizing with scales {0},{1} chose {2}", HeightScaleRatio, WidthScaleRatio, ScaleRatio);
    Debug.WriteLine ("Old font size was {0}, new={1} ", FontToUse.Size, ScaleFontSize);
    FontStyle OldFontStyle = FontToUse.Style;
    FontToUse.Dispose ();
    FontToUse = new Font (FontToUse.FontFamily, ScaleFontSize, OldFontStyle, FontUnit);
}


 public static void FindGoodFont (Graphics Graf, string sStringToFit, Size TextRoomAvail, ref Font FontToUse, GraphicsUnit FontUnit)
{
    SizeF RealSize = Graf.MeasureString (sStringToFit, FontToUse);
    Debug.WriteLine ("big string is {0}, orig size = {1},{2}", sStringToFit, RealSize.Width, RealSize.Height);
    if ((RealSize.Width > TextRoomAvail.Width) || (RealSize.Height > TextRoomAvail.Height))
    {
        float HeightScaleRatio = TextRoomAvail.Height / RealSize.Height;
        float WidthScaleRatio = TextRoomAvail.Width / RealSize.Width;
        float ScaleRatio;
        if (HeightScaleRatio < WidthScaleRatio)
        {
            ScaleRatio = HeightScaleRatio;
        } 
        else 
        {
            ScaleRatio = WidthScaleRatio;
        }

        float ScaleFontSize = FontToUse.Size * ScaleRatio;
        Debug.WriteLine ("Resizing with scales {0},{1} chose {2}", HeightScaleRatio, WidthScaleRatio, ScaleRatio);
        Debug.WriteLine ("Old font size was {0}, new={1} ", FontToUse.Size, ScaleFontSize);
        FontStyle OldFontStyle = FontToUse.Style;
        FontToUse.Dispose ();
        FontToUse = new Font (FontToUse.FontFamily, ScaleFontSize, OldFontStyle, FontUnit);
    }
    else 
    {
        Debug.WriteLine ("The space is big enough already");
    }

}


