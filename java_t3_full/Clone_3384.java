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




private XSSFFont transformDt2 (XSSFWorkbook workbookNew, HSSFFont fontOld) {
    XSSFFont fontNew = workbookNew.findFont(fontOld.getBold(),
                                    fontOld.getFontName(),
                                    (short)fontOld.getFontHeight(),
                                    fontOld.getIndex(),
                                    fontOld.getItalic(),
                                    fontOld.getStrikeout(),
                                    fontOld.getTypeOffset(),
                                    fontOld.getUnderline());
    
    if(fontNew == null){
        fontNew = workbookNew.createFont();
        fontNew.setBold(fontOld.getBold());
        fontNew.setCharSet(fontOld.getCharSet());
        fontNew.setColor(fontOld.getIndex());
        fontNew.setFontName(fontOld.getFontName());
        fontNew.setFontHeightInPoints(fontOld.getFontHeightInPoints());
        fontNew.setItalic(fontOld.getItalic());
        fontNew.setStrikeout(fontOld.getStrikeout());
        fontNew.setTypeOffset((short)fontOld.getTypeOffset());
        fontNew.setUnderline(fontOld.getUnderline());
    }
    
    return fontNew;
}


