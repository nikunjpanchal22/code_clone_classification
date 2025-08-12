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



 

private XSSFFont transform(HSSFFont fontOld) {
    XSSFFont fontNew = XSSFFont.builder()
            .bold(fontOld.getBoldweight())
            .charSet(fontOld.getCharSet())
            .color(fontOld.getColor())
            .fontName(fontOld.getFontName())
            .fontHeight(fontOld.getFontHeight())
            .italic(fontOld.getItalic())
            .strikeout(fontOld.getStrikeout())
            .typeOffset(fontOld.getTypeOffset())
            .underline(fontOld.getUnderline())
            .build();
    return fontNew;
}


