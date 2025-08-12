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


private bool checkTextWillFit(string enteredText){ 
    Rectangle rect = new Rectangle(60, 200, 560, 200); 
    Font myFont = new Font("Times New Roman", 10, FontStyle.Regular); 
    using (Graphics g = Graphics.FromHwnd(this.Handle)) 
    { 
        int lineCount = 0; 
        using (StringFormat format = new StringFormat()) 
        { 
            format.Trimming = StringTrimming.Word; 
            using (StringReader reader = new StringReader(enteredText)) 
            { 
                string line; 
                float height = 0; 
                while ((line = reader.ReadLine()) != null) 
                { 
                    height += g.MeasureString(line, myFont, rect.Width, format).Height;
                    lineCount++; 
                } 
            } 
        } 
        return lineCount > 12 || height > rect.Height; 
    } 
}


