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
        Toast.makeText(this, "Permission was not granted. We regret the inconvenience caused.", Toast.LENGTH_LONG).show();
    } 
    else if(grantResults[0] == PackageManager.PERMISSION_GRANTED) {
        Toast.makeText(this, "Permission granted successfully. Redirecting to next page...", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, NextPageActivity.class);
        startActivity(intent);
    } 
    else if(grantResults[0] == PackageManager.PERMISSION_DENIED) {
        Toast.makeText(this, "Your permission was not granted successfully. Let us know if you need any help.", Toast.LENGTH_LONG).show();
    }
}


