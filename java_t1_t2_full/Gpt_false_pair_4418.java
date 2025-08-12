public boolean onKeyDown (int keyCode, KeyEvent event) {
    super.onKeyDown (keyCode, event);
    if (keyCode == KeyEvent.KEYCODE_VOLUME_DOWN) {
        Toast.makeText (MainActivity.this, "Down working", Toast.LENGTH_SHORT).show ();
        return true;
    }
    return false;
}


public boolean onKeyDown (int keyCode, KeyEvent event) {
    super.onKeyDown (keyCode, event);
    if (keyCode == KeyEvent.KEYCODE_VOLUME_UP) {
        Toast.makeText (MainActivity.this, "Up working", Toast.LENGTH_SHORT).show ();
        return true;
    }
    return false;
}
