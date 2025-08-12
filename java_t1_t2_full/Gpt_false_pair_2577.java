public void onRequestPermissionsResult (int requestCode, String [] permissions, int [] grantResults) {
    super.onRequestPermissionsResult (requestCode, permissions, grantResults);
    switch (requestCode) {
        case REQUEST_READ_PHONE_STATE :
            {
                if (grantResults.length > 0 && grantResults [0] == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText (LoginActivity.this, "Permission granted.", Toast.LENGTH_SHORT).show ();
                    finish ();
                    startActivity (getIntent ());
                } else {
                    Toast.makeText (LoginActivity.this, "The app was not allowed to get your phone state. Hence, it cannot function properly. Please consider granting it this permission", Toast.LENGTH_LONG).show ();
                }
            } case REQUEST_ACCESS_FINE_LOCATION :
            {
                if (grantResults.length > 0 && grantResults [0] == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText (LoginActivity.this, "Permission granted.", Toast.LENGTH_SHORT).show ();
                    finish ();
                    startActivity (getIntent ());
                } else {
                    Toast.makeText (LoginActivity.this, "The app was not allowed to get your location. Hence, it cannot function properly. Please consider granting it this permission", Toast.LENGTH_LONG).show ();
                }
            } case REQUEST_WRITE_STORAGE :
            {
                if (grantResults.length > 0 && grantResults [0] == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText (LoginActivity.this, "Permission granted.", Toast.LENGTH_SHORT).show ();
                    finish ();
                    startActivity (getIntent ());
                } else {
                    Toast.makeText (LoginActivity.this, "The app was not allowed to write to your storage. Hence, it cannot function properly. Please consider granting it this permission", Toast.LENGTH_LONG).show ();
                }
            }}
}


 public void onRequestPermissionsResult (int requestCode, String [] permissions, int [] grantResults) {
    super.onRequestPermissionsResult (requestCode, permissions, grantResults);
    switch (requestCode) {
        case REQUEST_READ_PHONE_STATE :
            {
                if (grantResults.length > 0 && grantResults [0] == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText (LoginActivity.this, "Permission granted for the app to access your phone state!", Toast.LENGTH_SHORT).show ();
                    finish ();
                    startActivity (getIntent ());
                } else {
                    Toast.makeText (LoginActivity.this, "The app cannot correctly execute its tasks without access to your phone state. Please consider granting it this permission.", Toast.LENGTH_LONG).show ();
                }
            } case REQUEST_ACCESS_FINE_LOCATION :
            {
                if (grantResults.length > 0 && grantResults [0] == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText (LoginActivity.this, "You granted the app complete access to your location! Enjoy the service.", Toast.LENGTH_SHORT).show ();
                    finish ();
                    startActivity (getIntent ());
                } else {
                    Toast.makeText (LoginActivity.this, "The app has to access your location to deliver its full functionalities. Please consider granting it this permission.", Toast.LENGTH_LONG).show ();
                }
            } case REQUEST_WRITE_STORAGE :
            {
                if (grantResults.length > 0 && grantResults [0] == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText (LoginActivity.this, "Success! Writing to your storage enabled.", Toast.LENGTH_SHORT).show ();
                    finish ();
                    startActivity (getIntent ());
                } else {
                    Toast.makeText (LoginActivity.this, "The app cannot perform its tasks without writing to your storage. Please consider granting it this permission.", Toast.LENGTH_LONG).show ();
                }
            }}
}
