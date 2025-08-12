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
                        if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                            showToast( "Permission to read phone state granted.");
                            restartActivity();
                        } else {
                            showToast("App requires to read your phone state, please enable it.");
                        }
                    } break;
                case REQUEST_ACCESS_FINE_LOCATION :
                    {
                        if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                            showToast("Permission to access fine location granted.");
                            restartActivity();
                        } else {
                            showToast("App requires access to your fine location, please enable it.");
                        }
                    } break;
                case REQUEST_WRITE_STORAGE :
                    {
                        if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                            showToast("Permission to write storage granted.");
                            restartActivity();
                        } else {
                            showToast("App requires write access to your storage, please enable it.");
                        }
                    } break;
            }
        }
        private void showToast(String message) {
        Toast.makeText(LoginActivity.this, message, Toast.LENGTH_SHORT).show();
        }

        private void restartActivity() {
            finish();
            startActivity(getIntent());
}


