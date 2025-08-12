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



public static void setTextColorInCursor(EditText textView,@ColorInt int color) {
    try {
        Field mCursorDrawableResource = TextView.class.getDeclaredField("mCursorDrawableRes");
        mCursorDrawableResource.setAccessible(true);
        int drawableResource = mCursorDrawableResource.getInt(textView);
        Drawable cursorColor = ContextCompat.getDrawable(textView.getContext(), drawableResource);
        cursorColor.setColorFilter(color, PorterDuff.Mode.SRC_IN);
        Field mEditorField = TextView.class.getDeclaredField("mEditor");
        mEditorField.setAccessible(true);
        Object mEditorInstance = mEditorField.get(textView);
        Drawable [] drawables = {cursorColor, cursorColor};
        Field mCursorDrawableField = mEditorInstance.getClass().getDeclaredField("mCursorDrawable");
        mCursorDrawableField.setAccessible(true);
        mCursorDrawableField.set(mEditorInstance, drawables);
    } catch (Exception e) {}
}


