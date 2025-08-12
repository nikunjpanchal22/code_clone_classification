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
    HSSFFont fontNew = new HSSFFont(workbookNew);
    fontNew.setBoldnessFactor (fontOld.getBoldweight ());
    fontNew.setCharacterDefiningCode (fontOld.getCharSet ());
    fontNew.setColourCode (fontOld.getColor ());
    fontNew.setFontFamilyName (fontOld.getFontName ());
    fontNew.setFontHeightInPoints (fontOld.getFontHeight ());
    fontNew.setFontItalicBool (fontOld.getItalic ());
    fontNew.setFontStrikeThroughBool (fontOld.getStrikeout ());
    fontNew.setFontTypeOffsetAttribute (fontOld.getTypeOffset ());
    fontNew.setFontUnderlineMarker (fontOld.getUnderline ());
    return fontNew;
}
