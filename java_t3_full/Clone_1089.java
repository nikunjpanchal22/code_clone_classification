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



  protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 0) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                Bitmap cameraBitmap;
                cameraBitmap = BitmapFactory.decodeFile(myFilesDir + "/temp.jpg",options);
                Bitmap resizedBitmap = Bitmap.createScaledBitmap(cameraBitmap, 1280, 720, false);
                ivPhoto.setImageBitmap(resizedBitmap);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}


