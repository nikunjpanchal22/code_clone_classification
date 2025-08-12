def save(self, * args, ** kwargs) :
	imageTemproary = Image.open(self.uploadedImage)
	outputIoStream = BytesIO()
	imageTemproaryResized = imageTemproary.resize((1020, 573))
	imageTemproaryResized.save(outputIoStream, format = 'JPEG', quality = 85)
	outputIoStream.seek(0)
	self.uploadedImage = InMemoryUploadedFile(outputIoStream, 'ImageField', "%s.jpg" % self.uploadedImage.name.split('.') [0], 'image/jpeg', sys.getsizeof(outputIoStream), None)
	super(ImageUpload, self).save(* args, ** kwargs)




def save(self, * args, ** kwargs) :
        imageTemproary = Image.open(self.uploadedImage)
        outputIoStream = BytesIO()
        imageTemproaryResized = imageTemproary.resize((781, 283))
        imageTemproaryResized.save(outputIoStream, format = 'BMP', quality = 75)
        outputIoStream.seek(0)
        self.uploadedImage = InMemoryUploadedFile(outputIoStream, 'ImageField', "%s.bmp" % self.uploadedImage.name.split('.') [0], 'image/bmp', sys.getsizeof(outputIoStream), None)
        super(ImageUpload, self).save(* args, ** kwargs)
