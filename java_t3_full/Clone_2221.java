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
XSSFFont fontNew = this.workbookNew.createFont();
fontNew.setBoldweight(FontWeight.fromInt(fontOld.getBoldWeight()));
fontNew.setCharSet(FontCharSet.fromByte(fontOld.getCharSet()));
fontNew.setColor(fontOld.getColor());
fontNew.setFontName(fontOld.getFontName());
fontNew.setFontHeight(fontOld.getFontHeight());
fontNew.setItalic(fontOld.getItalic());
fontNew.setStrikeout(fontOld.getStrikeout());
fontNew.setTypeOffset(FontsetType.fromInt(fontOld.getTypeOffset()));
fontNew.setUnderline(FontUnderline.fromByte(fontOld.getUnderline()));
return fontNew;
}


