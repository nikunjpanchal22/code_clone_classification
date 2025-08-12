protected void onActivityResult (int requestCode, int resultCode, Intent data) {
    super.onActivityResult (requestCode, resultCode, data);
    if (requestCode == 0) {
        try {
            Bitmap cameraBitmap;
            cameraBitmap = BitmapFactory.decodeFile (myFilesDir + "/temp.jpg");
            Bitmap.createBitmap (cameraBitmap);
            ivPhoto.setImageBitmap (cameraBitmap);
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }
}




@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == REQ_CAMERA_IMAGE && resultCode == RESULT_OK) {
        try {
            Bitmap bmp = BitmapFactory.decodeFile(tempPhotoPath);
            imagePreview.setImageBitmap(bmp);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}


