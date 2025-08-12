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
    int id = item.getItemId();
    if(id == android.R.id.home) {
        if(getParentActivityIntent() == null) {
            onBackPressed();
            Log.v(TAG, "Parent Activity not defined!");
        } else {
            NavUtils.navigateUpFromSameTask(this);
        }
        return true;
    }
    return super.onOptionsItemSelected(item);
}


