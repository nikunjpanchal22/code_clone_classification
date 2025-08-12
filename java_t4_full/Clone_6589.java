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
                case REQUEST_READ_STORAGE :
                    {
                        if (checkGrantResults(grantResults)) {
                            showToastMessage("Permission to read storage granted.");
                            finish();
                            startActivity (getIntent ());
                        } else {
                            showToastMessage("The app needs to read your storage to function correctly.");
                        }
                    } break;
                case REQUEST_CALL_PHONE :
                    {
                        if (checkGrantResults(grantResults)) {
                            showToastMessage ("Permission to make phone calls granted.");
                            restartApplication ();
                        } else {
                            showToastMessage ("The app requires the ability to make phone calls to operate.");
                        }
                    } break;
                case REQUEST_SEND_SMS :
                    {
                        if (checkGrantResults(grantResults)) {
                            showToastMessage ("Permission to send SMS granted.");
                            restartApplication ();
                        } else {
                            showToastMessage ("The app needs to send SMS to operate properly.");
                        }
                    } break;
            }
        }

        private void restartApplication() {
            finish();
            startActivity(getIntent());
        }

        private void showToastMessage(String message) {
            Toast.makeText(LoginActivity.this, message, Toast.LENGTH_LONG).show();
        }

        private boolean checkGrantResults(int[] grantResults) {
            return grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED;
}


