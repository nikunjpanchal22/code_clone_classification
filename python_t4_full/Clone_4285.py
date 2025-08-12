def save(self, * args, ** kwargs) :
	imageTemproary = Image.open(self.uploadedImage)
	outputIoStream = BytesIO()
	imageTemproaryResized = imageTemproary.resize((1020, 573))
	imageTemproaryResized.save(outputIoStream, format = 'JPEG', quality = 85)
	outputIoStream.seek(0)
	self.uploadedImage = InMemoryUploadedFile(outputIoStream, 'ImageField', "%s.jpg" % self.uploadedImage.name.split('.') [0], 'image/jpeg', sys.getsizeof(outputIoStream), None)
	super(ImageUpload, self).save(* args, ** kwargs)




def save(self, *args, **kwargs):
    img = Image.open(self.image)
    buffer = BytesIO()
    img.thumbnail((1020, 573))
    img.save(buffer, format="PNG")
    buffer.seek(0)
    imgField = InMemoryUploadedFile(buffer, 'ImageField', self.image.name, 'image/png', sys.getsizeof(buffer), None)
    self.image = imgField
    super().save(*args, **kwargs)


