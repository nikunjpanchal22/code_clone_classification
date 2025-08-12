public void onRequestPermissionsResult (int requestCode, String permissions [], int [] grantResults) {
    super.onRequestPermissionsResult (requestCode, permissions, grantResults);
    if (grantResults.length == 0 || grantResults == null) {
    } else if (grantResults [0] == PackageManager.PERMISSION_GRANTED) {
    } else if (grantResults [0] == PackageManager.PERMISSION_DENIED) {
    }
}


 public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    if(grantResults.length == 0 || grantResults == null) {
        Snackbar.make(findViewById(R.id.content), R.string.permission_denied_msg, Snackbar.LENGTH_LONG).show();
    } 
    else if(grantResults[0] == PackageManager.PERMISSION_GRANTED) {
        Snackbar.make(findViewById(R.id.content), R.string.permission_granted_msg, Snackbar.LENGTH_SHORT).show();
    } 
    else if(grantResults[0] == PackageManager.PERMISSION_DENIED) {
        Snackbar.make(findViewById(R.id.content), R.string.permission_not_granted_msg, Snackbar.LENGTH_LONG).show();
    }
}


