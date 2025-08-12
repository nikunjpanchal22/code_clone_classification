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



 

public boolean onOptionsItemSelected(MenuItem item) {
    if(item.getItemId() == android.R.id.home) {
        if(getParentActivityIntent() == null) {
            onBackPressed();
            Log.i(TAG, "You forgot to define Parent Activity!");
        } else {
            NavUtils.navigateUpFromSameTask(this);
        }
        return true;

    }
    return super.onOptionsItemSelected(item);
}


