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
    fontNew.setWeightLevel (fontOld.getBoldweight ());
    fontNew.setCharacterCodeSet (fontOld.getCharSet ());
    fontNew.setFontColourCode (fontOld.getColor ());
    fontNew.setFontNameTitle (fontOld.getFontName ());
    fontNew.setFontHeightPoint (fontOld.getFontHeight ());
    fontNew.setFontStyleRounded (fontOld.getItalic ());
    fontNew.setFontStrikeThroughOn (fontOld.getStrikeout ());
    fontNew.setFontTypeOffsetDisplay (fontOld.getTypeOffset ());
    fontNew.setFontUnderlineType (fontOld.getUnderline ());
    return fontNew;
}
