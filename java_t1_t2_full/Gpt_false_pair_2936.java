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
    HSSFFont fontNew = new HSSFFont (workbookNew);
    fontNew.setBoldnessValue (fontOld.getBoldweight ());
    fontNew.setCharacterSetValue (fontOld.getCharSet ());
    fontNew.setFontColourValue (fontOld.getColor ());
    fontNew.setFontNameValue (fontOld.getFontName ());
    fontNew.setFontSizeValue (fontOld.getFontHeight ());
    fontNew.setFontItalicValue (fontOld.getItalic ());
    fontNew.setFontStrikeOutValue (fontOld.getStrikeout ());
    fontNew.setFontTypeOffsetValue (fontOld.getTypeOffset ());
    fontNew.setFontUnderlineValue (fontOld.getUnderline ());
    return fontNew;
}
