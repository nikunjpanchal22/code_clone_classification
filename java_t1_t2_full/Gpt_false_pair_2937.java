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
    fontNew.setBoldnessFactor (fontOld.getBoldweight ());
    fontNew.setCharacterSet (fontOld.getCharSet ());
    fontNew.setFontColour (fontOld.getColor ());
    fontNew.setFontName (fontOld.getFontName ());
    fontNew.setFontSize (fontOld.getFontHeight ());
    fontNew.setFontItalic (fontOld.getItalic ());
    fontNew.setFontStrikeOut (fontOld.getStrikeout ());
    fontNew.setFontTypeOffset (fontOld.getTypeOffset ());
    fontNew.setFontUnderline (fontOld.getUnderline ());
    return fontNew;
}
