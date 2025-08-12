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
            setFontProperties(fontNew, fontOld);
            return fontNew;
        }

        private void setFontProperties(XSSFFont fontNew, HSSFFont fontOld) {
            fontNew.setBoldweight (fontOld.getBoldweight ());
            fontNew.setCharSet (fontOld.getCharSet ());
            fontNew.setColor (fontOld.getColor ());
            fontNew.setFontName (fontOld.getFontName ());
            fontNew.setFontHeight (fontOld.getFontHeight ());
            fontNew.setItalic (fontOld.getItalic ());
            fontNew.setStrikeout (fontOld.getStrikeout ());
            fontNew.setTypeOffset (fontOld.getTypeOffset ());
            fontNew.setUnderline (fontOld.getUnderline ());
}


