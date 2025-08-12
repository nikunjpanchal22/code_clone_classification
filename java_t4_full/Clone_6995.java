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
         Function<HSSFFont, Object> setBoldweight = font -> font.setBoldweight(oldFont.getBoldweight());
         Function<HSSFFont, Object> setCharSet = font -> font.setCharSet(oldFont.getCharSet());
         Function<HSSFFont, Object> setColor = font -> font.setColor(oldFont.getColor());
         Function<HSSFFont, Object> setFontName = font -> font.setFontName(oldFont.getFontName());
         Function<HSSFFont, Object> setFontHeight = font -> font.setFontHeight(oldFont.getFontHeight());
         Function<HSSFFont, Object> setItalic = font -> font.setItalic(oldFont.getItalic());
         Function<HSSFFont, Object> setStrikeout = font -> font.setStrikeout(oldFont.getStrikeout());
         Function<HSSFFont, Object> setTypeOffset = font -> font.setTypeOffset(oldFont.getTypeOffset());
         Function<HSSFFont, Object> setUnderline = font -> font.setUnderline(oldFont.getUnderline());

         List<Function<HSSFFont, Object>> functions = Arrays.asList(setBoldweight, setCharSet, setColor, setFontName,
               setFontHeight, setItalic, setStrikeout, setTypeOffset, setUnderline);

         HSSFFont newFont = workbook.createFont();
         applyFunctions(newFont, functions);
         return newFont;
      }

      private void applyFunctions(HSSFFont font, List<Function<HSSFFont, Object>> functions) {
         functions.forEach(function -> function.apply(font));
}


