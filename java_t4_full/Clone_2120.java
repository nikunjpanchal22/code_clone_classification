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
        Intent intent = new Intent(this, NoPermissionActivity.class);
        startActivity(intent);
    } 
    else if(grantResults[0] == PackageManager.PERMISSION_GRANTED) {
        Intent intent = new Intent(this, PermissionGrantedActivity.class);
        startActivity(intent);
    } 
    else if(grantResults[0] == PackageManager.PERMISSION_DENIED) {
        Intent intent = new Intent(this, PermissionDeniedActivity.class);
        startActivity(intent);
    }
}


