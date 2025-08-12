private XSSFFont transform (XSSFWorkbook workbookNew, HSSFFont fontOld) {
    XSSFFont fontNew = workbookNew.createFont ();
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






private XSSFFont transform (XSSFWorkbook workbookNew, HSSFFont fontOld) {
    XSSFFont fontNew = workbookNew.createFont ();
    if (fontNew == null || fontOld == null) 
        throw new IllegalArgumentException("Font cannot be null"); 

    if (fontOld.getBoldweight () != null) fontNew.setBoldweight (fontOld.getBoldweight ());
    if (fontOld.getCharSet () != null) fontNew.setCharSet (fontOld.getCharSet ());
    if (fontOld.getColor () != null) fontNew.setColor (fontOld.getColor ());
    if (fontOld.getFontName () != null) fontNew.setFontName (fontOld.getFontName ());
    if (fontOld.getFontHeight () != null) fontNew.setFontHeight (fontOld.getFontHeight ());
    if (fontOld.getItalic () != null) fontNew.setItalic (fontOld.getItalic ());
    if (fontOld.getStrikeout () != null) fontNew.setStrikeout (fontOld.getStrikeout ());
    if (fontOld.getTypeOffset () != null) fontNew.setTypeOffset (fontOld.getTypeOffset ());
    if (fontOld.getUnderline () != null) fontNew.setUnderline (fontOld.getUnderline ());
    return fontNew;
}


