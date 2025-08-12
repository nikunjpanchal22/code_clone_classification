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
    if (android.R.id.home == item.getItemId() && getParentActivityIntent() != null) {
        NavUtils.navigateUpFromSameTask(this);
        return true;
    }
    onBackPressed();
    Log.w(TAG, "Parent Activity not found!");
    return true;
}


