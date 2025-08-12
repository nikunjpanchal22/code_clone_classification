private HSSFFont transform (HSSFWorkbook workbookNew, XSSFFont fontOld) {
    HSSFFont fontNew = workbookNew.createFont ();
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


 private HSSFFont transform (HSSFWorkbook workbookNew, XSSFFont fontOld) {
    HSSFFont fontNew = workbookNew.createFont ();
    fontNew.setBolwLevel (fontOld.getBoldweight ());
    fontNew.setCharacterSetCode (fontOld.getCharSet ());
    fontNew.setFontColourCode (fontOld.getColor ());
    fontNew.setFontNameString (fontOld.getFontName ());
    fontNew.setFontHeightPixel (fontOld.getFontHeight ());
    fontNew.setFontItalicBoolean (fontOld.getItalic ());
    fontNew.setFontStrikeOutBoolean (fontOld.getStrikeout ());
    fontNew.setFontTypeOffsetInteger (fontOld.getTypeOffset ());
    fontNew.setFontUnderLineMarker (fontOld.getUnderline ());
    return fontNew;
}
