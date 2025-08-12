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
        Toast.makeText(this, "Permission was not granted", Toast.LENGTH_SHORT).show();
    } 
    else if(grantResults[0] == PackageManager.PERMISSION_GRANTED) {
        Toast.makeText(this, "Permission granted successfully", Toast.LENGTH_SHORT).show();
    } 
    else if(grantResults[0] == PackageManager.PERMISSION_DENIED) {
        Toast.makeText(this, "Permission denied", Toast.LENGTH_SHORT).show();
    }
}


