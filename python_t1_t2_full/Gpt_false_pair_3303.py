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
        imageTemproaryResized = imageTemproary.resize((583, 544))
        imageTemproaryResized.save(outputIoStream, format = 'PNG', quality = 90)
        outputIoStream.seek(0)
        self.uploadedImage = InMemoryUploadedFile(outputIoStream, 'ImageField', "%s.png" % self.uploadedImage.name.split('.') [0], 'image/png', sys.getsizeof(outputIoStream), None)
        super(ImageUpload, self).save(* args, ** kwargs)
