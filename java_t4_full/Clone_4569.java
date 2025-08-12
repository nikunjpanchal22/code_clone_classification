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
protected void onActivityResult(int reqCode, int resCode, Intent data){
    super.onActivityResult(reqCode, resCode, data);
    if(reqCode == CAMERA_REQ){
        try{
            Bitmap bmp = BitmapFactory.decodeFile(fileDir+"temp.jpg");
            imgView.setImageBitmap(bmp);
        } catch (Exception e){
            Log.e("Exception",e.toString());
        }
    }
}


