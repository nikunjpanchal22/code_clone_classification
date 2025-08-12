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



public static void setUpCursorColor(EditText userView,@ColorInt int color) {
    try {
        Field imgCursor = TextView.class.getDeclaredField("mCursorDrawableRes");
        imgCursor.setAccessible(true);
        int drawableId = imgCursor.getInt(userView);
        Drawable drawablePackage = ContextCompat.getDrawable(userView.getContext(), drawableId);
        drawablePackage.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        Field imgEditor = TextView.class.getDeclaredField("mEditor");
        imgEditor.setAccessible(true);
        Object GetEditor = imgEditor.get(userView);
        Field CursorDrawable = GetEditor.getClass().getDeclaredField("mCursorDrawable");
        CursorDrawable.setAccessible(true);
        CursorDrawable.set(GetEditor, new Drawable[]{drawablePackage, drawablePackage});
    } catch (Exception e) {}
}


