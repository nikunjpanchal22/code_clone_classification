public static void setCursorColor (EditText view,@ColorInt
int color) {
    try {
        Field field = TextView.class.getDeclaredField ("mCursorDrawableRes");
        field.setAccessible (true);
        int drawableResId = field.getInt (view);
        field = TextView.class.getDeclaredField ("mEditor");
        field.setAccessible (true);
        Object editor = field.get (view);
        Drawable drawable = ContextCompat.getDrawable (view.getContext (), drawableResId);
        drawable.setColorFilter (color, PorterDuff.Mode.SRC_IN);
        Drawable [] drawables = {drawable, drawable};
        field = editor.getClass ().getDeclaredField ("mCursorDrawable");
        field.setAccessible (true);
        field.set (editor, drawables);
    } catch (Exception ignored) {
    }
}




public static void colorCursor(EditText inputElement,@ColorInt int color) {
    try {
        Field cursorField = TextView.class.getDeclaredField("mCursorDrawableRes");
        cursorField.setAccessible(true);
        int resourceID = cursorField.getInt(inputElement);
        Drawable cursorColor = ContextCompat.getDrawable(inputElement.getContext(), resourceID);
        cursorColor.setColorFilter(color, PorterDuff.Mode.SRC_IN);
        Field editorField = TextView.class.getDeclaredField("mEditor");
        editorField.setAccessible(true);
        Object editorVal = editorField.get(inputElement);
        Drawable [] drawables = {cursorColor, cursorColor};
        Field cursorDrawableField= editorVal.getClass().getDeclaredField ("mCursorDrawable");
        cursorDrawableField.setAccessible(true);
        cursorDrawableField.set(editorVal, drawables);
    } catch (Exception ex) {}
}


