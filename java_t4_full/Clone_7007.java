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

   // Map each property using a lambda. Requires Java 8 or later.
   List<BiConsumer<HSSFFont, XSSFFont>> propertySetters = Arrays.asList(
           (nf, of) -> nf.setBoldweight(of.getBoldweight()),
           (nf, of) -> nf.setCharSet(of.getCharSet()),
           (nf, of) -> nf.setColor(of.getColor()),
           (nf, of) -> nf.setFontName(of.getFontName()),
           (nf, of) -> nf.setFontHeight(of.getFontHeight()),
           (nf, of) -> nf.setItalic(of.getItalic()),
           (nf, of) -> nf.setStrikeout(of.getStrikeout()),
           (nf, of) -> nf.setTypeOffset(of.getTypeOffset()),
           (nf, of) -> nf.setUnderline(of.getUnderline())
   );
   propertySetters.forEach(ps -> ps.accept(newFont, oldFont));
   return newFont;
}


