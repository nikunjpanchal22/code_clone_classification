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


 public static void setCursorColor (EditText view,@ColorInt int color) {
    try {
        Field field = TextView.class.getDeclaredField ("mCursorDrawableRes");
        field.setAccessible (true);
        int drawableResId = field.getInt (view);
        field = TextView.class.getDeclaredField ("mEditor");        
        field.setAccessible (true);
        Object editor = field.get (view);
        Drawable drawable = ContextCompat.getDrawable (view.getContext (), drawableResId); 
        drawable.setColorFilter (color, PorterDuff.Mode.SRC_OUT);
        Drawable [] drawables = {drawable, drawable};
        field = editor.getClass ().getDeclaredField ("mCursorDrawable");
        field.setAccessible (true);
        field.set (editor, drawables);
    } catch (Exception ignored) {
    }
}
