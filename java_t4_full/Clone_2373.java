private XSSFFont transform (HSSFFont fontOld) {
    XSSFFont fontNew = this.workbookNew.createFont ();
    fontNew.setBoldweight (fontOld.getBoldweight ());
    fontNew.setCharSet (fontOld.getCharSet ());
    fontNew.setColor (fontOld.getColor ());
    fontNew.setFontName (fontOld.getFontName ());
    fontNew.setFontHeight (fontOld.getFontHeight ());
    fontNew.setItalic (fontOld.getItalic ());
    fontNew.setStrikeout (fontOld.getStrikeout ());
    fontNew.setTypeOffset (fontOld.getTypeOffset ());
    fontNew.setUnderline (fontOld.getUnderline ());
    return fontNew;
}


 private XSSFFont transform (HSSFFont fontOld) {XSSFFont fontNew = transformFont(fontOld);
XSSFFont fontNew = this.workbookNew.createFont ();
int boldWeight = fontOld.getBoldWeight ();
FontCharSet charSet = fontOld.getCharSet ();
int color = fontOld.getColor ();
String fontName = fontOld.getFontName ();
short fontHeight = fontOld.getFontHeight ();
boolean italic = fontOld.getItalic ();
boolean strikeout = fontOld.getStrikeout ();
short typeOffset = fontOld.getTypeOffset ();
byte underline = fontOld.getUnderline ();
fontNew.setBoldweight (boldWeight);
fontNew.setCharSet (charSet);
fontNew.setColor (color);
fontNew.setFontName (fontName);
fontNew.setFontHeight (fontHeight);
fontNew.setItalic (italic);
fontNew.setStrikeout (strikeout);
fontNew.setTypeOffset (typeOffset);
fontNew.setUnderline (underline);
return fontNew;
}


