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
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Permission was not granted").setTitle("Error");
            AlertDialog dialog = builder.create();
            dialog.show();
    } 
    else if(grantResults[0] == PackageManager.PERMISSION_GRANTED) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Permission granted successfully").setTitle("Success");
            AlertDialog dialog = builder.create();
            dialog.show();
    } 
    else if(grantResults[0] == PackageManager.PERMISSION_DENIED) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Permission denied").setTitle("Error");
            AlertDialog dialog = builder.create();
            dialog.show();
    }
}


