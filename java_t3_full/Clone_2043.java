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
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
            .setSmallIcon(R.drawable.ic_notification_alert)
            .setContentTitle("Permission was not granted")
            .setContentText("Permission was not granted");
    } 
    else if(grantResults[0] == PackageManager.PERMISSION_GRANTED) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
            .setSmallIcon(R.drawable.ic_notification_granted)
            .setContentTitle("Permission granted successfully")
            .setContentText("Permission granted successfully");
    } 
    else if(grantResults[0] == PackageManager.PERMISSION_DENIED) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
            .setSmallIcon(R.drawable.ic_notification_denied)
            .setContentTitle("Permission denied")
            .setContentText("Permission denied");
    }
}


