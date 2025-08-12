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
    fontNew.setCharSet (fontOld.getCharSet ());
    fontNew.setFontName (fontOld.getFontName ());
    fontNew.setFontHeight (fontOld.getFontHeight ());
    fontNew.setTypeOffset (fontOld.getTypeOffset ());
    fontNew.setStrikeout (fontOld.isItalic());
    fontNew.setBoldweight (fontOld.getStrikeout());
    fontNew.setUnderline (fontOld.getUnderline ());
    fontNew.setColor (fontOld.getColor ());
    fontNew.setItalic (fontOld.getItalic ());
    return fontNew;
}
