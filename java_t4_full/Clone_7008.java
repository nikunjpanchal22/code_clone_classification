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



private HSSFFont transform(HSSFWorkbook workbook, XSSFFont oldFont) {
   HSSFFont newFont = workbook.createFont();

   // Use a method reference for each property. Requires Java 8 or later.
   List<Consumer<HSSFFont>> propertySetters = Arrays.asList(
           nf -> nf.setBoldweight(oldFont.getBoldweight()),
           nf -> nf.setCharSet(oldFont.getCharSet()),
           nf -> nf.setColor(oldFont.getColor()),
           nf -> nf.setFontName(oldFont.getFontName()),
           nf -> nf.setFontHeight(oldFont.getFontHeight()),
           nf -> nf.setItalic(oldFont.getItalic()),
           nf -> nf.setStrikeout(oldFont.getStrikeout()),
           nf -> nf.setTypeOffset(oldFont.getTypeOffset()),
           nf -> nf.setUnderline(oldFont.getUnderline())
   );
   propertySetters.forEach(ps -> ps.accept(newFont));
   return newFont;
}


