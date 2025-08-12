def save(self, * args, ** kwargs) :
	imageTemproary = Image.open(self.uploadedImage)
	outputIoStream = BytesIO()
	imageTemproaryResized = imageTemproary.resize((1020, 573))
	imageTemproaryResized.save(outputIoStream, format = 'JPEG', quality = 85)
	outputIoStream.seek(0)
	self.uploadedImage = InMemoryUploadedFile(outputIoStream, 'ImageField', "%s.jpg" % self.uploadedImage.name.split('.') [0], 'image/jpeg', sys.getsizeof(outputIoStream), None)
	super(ImageUpload, self).save(* args, ** kwargs)


    outstream.seek(0)
    self.user_image = InMemoryUploadedFile(outstream,'ImageField', self.user_image.name, 'image/jpeg', sys.getsizeof(outstream), None)
    super().save(*args, **kwargs)




def save(self, *args, **kwargs):
    image_temp = Image.open(self.image_file)
    stream = BytesIO()


