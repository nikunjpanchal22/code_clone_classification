private bool checkTextWillFit (string enteredText) {
    StringFormat format1 = new StringFormat ();
    format1.Trimming = StringTrimming.Word;
    RectangleF rectfText;
    int iCharactersFitted, iLinesFitted;
    rectfText = new RectangleF (60.0F, 200.0F, 560.0F, 200.0F);
    Graphics g = printDocument1.PrinterSettings.CreateMeasurementGraphics ();
    Font myFont = new Font ("Times New Roman", 10, FontStyle.Regular);
    g.MeasureString (enteredText, myFont, rectfText.Size, format1, out iCharactersFitted, out iLinesFitted);
    if (iLinesFitted > 12) {
        return true;
    } else {
        return false;
    }
}


 private bool checkTextWillFit(string enteredText) 
{ 
    StringFormat format1 = new StringFormat (); 
    format1.Trimming = StringTrimming.Word; 
    RectangleF rectfText = new RectangleF (60.0F, 200.0F, 560.0F, 200.0F); 
    Graphics g = printDocument1.PrinterSettings.CreateMeasurementGraphics(); 
    Font myFont = new Font("Times New Roman", 10, FontStyle.Regular); 
    SizeF size = g.MeasureString(enteredText, myFont,rectfText.Size, format1); 
    int lines = (int)Math.Ceiling(size.Height/myFont.Height); 
    return (lines > 12); 
  
}


