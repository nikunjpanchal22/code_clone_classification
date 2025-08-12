def save(self, * args, ** kwargs) :
	imageTemproary = Image.open(self.uploadedImage)
	outputIoStream = BytesIO()
	imageTemproaryResized = imageTemproary.resize((1020, 573))
	imageTemproaryResized.save(outputIoStream, format = 'JPEG', quality = 85)
	outputIoStream.seek(0)
	self.uploadedImage = InMemoryUploadedFile(outputIoStream, 'ImageField', "%s.jpg" % self.uploadedImage.name.split('.') [0], 'image/jpeg', sys.getsizeof(outputIoStream), None)
	super(ImageUpload, self).save(* args, ** kwargs)





def save(self, *args, **kwargs):
    image = Image.open(self.pic)
    buffer = BytesIO()
    image.save(buffer, format='PNG', optimize=True)
    buffer.seek(0)
    self.pic = InMemoryUploadedFile(buffer, 'ImageField', "%s.png" % self.pic.name.split('.') [0], 'image/png', len(buffer.getvalue()), None)


