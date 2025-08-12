public boolean onOptionsItemSelected (MenuItem item) {
    switch (item.getItemId ()) {
        case android.R.id.home :
            if (getParentActivityIntent () == null) {
                Log.i (TAG, "You have forgotten to specify the parentActivityName in the AndroidManifest!");
                onBackPressed ();
            } else {
                NavUtils.navigateUpFromSameTask (this);
            }
            return true;
        default :
            return super.onOptionsItemSelected (item);
    }
}


public boolean onOptionsItemSelected (MenuItem item) {
    int id = item.getItemId ();
    switch (id) {
        case android.R.id.home :
            if (getParentActivityIntent () == null) {
                Log.i (TAG, "You have forgotten to specify the parentActivityName in the AndroidManifest!");
                onBackPressed ();
            } else {
                NavUtils.navigateUpFromSameTask (this);
            }
            return true;
        default :
            return super.onOptionsItemSelected (item);
    }
}
