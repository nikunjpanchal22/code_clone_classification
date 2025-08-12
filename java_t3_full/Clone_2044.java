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
        showDialog(this, "Permission was not granted");
    } 
    else if(grantResults[0] == PackageManager.PERMISSION_GRANTED) {
        showDialog(this, "Permission granted successfully");
    } 
    else if(grantResults[0] == PackageManager.PERMISSION_DENIED) {
        showDialog(this, "Permission denied");
    }
}


