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





private HSSFFont transform(HSSFWorkbook workbook, XSSFFont font) {
    HSSFFont newFont = workbook.createFont();
    Arrays.asList(font.getClass().getMethods())
            .forEach(method -> {
                try {
                    Method newFontMethod = newFont.getClass().getMethod(method.getName(), method.getParameterTypes());
                    newFontMethod.invoke(newFont, method.invoke(font));
                } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            });
    return newFont;
}


