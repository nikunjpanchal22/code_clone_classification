def save(self, * args, ** kwargs) :
	imageTemproary = Image.open(self.uploadedImage)
	outputIoStream = BytesIO()
	imageTemproaryResized = imageTemproary.resize((1020, 573))
	imageTemproaryResized.save(outputIoStream, format = 'JPEG', quality = 85)
	outputIoStream.seek(0)
	self.uploadedImage = InMemoryUploadedFile(outputIoStream, 'ImageField', "%s.jpg" % self.uploadedImage.name.split('.') [0], 'image/jpeg', sys.getsizeof(outputIoStream), None)
	super(ImageUpload, self).save(* args, ** kwargs)


        self.image_upload = InMemoryUploadedFile(f,'ImageField', self.image_upload.name, 'image/png', sys.getsizeof(f), None)
    super().save(*args, **kwargs)




def save(self, *args, **kwargs):
    img = Image.open(self.user_image)
    outstream = BytesIO()
    img.thumbnail((900, 500))


