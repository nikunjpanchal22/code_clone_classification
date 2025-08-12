def save(self, * args, ** kwargs) :
	if self.image_url :
		import urllib, os
		from urlparse import urlparse
		file_save_dir = self.upload_path
		filename = urlparse(self.image_url).path.split('/') [- 1]
		urllib.urlretrieve(self.image_url, os.path.join(file_save_dir, filename))
		self.image = os.path.join(file_save_dir, filename)
		self.image_url = ''
	super(tweet_photos, self).save()


            shutil.copyfileobj(response, out_file)
        self.image = os.path.join(self.upload_path, file_name)
        self.image_url = ''
    super().save()



def save(self, * args, ** kwargs):
    if self.image_url:
        import requests, os
        from urllib.parse import urlparse
        file_name = os.path.basename(urlparse(self.image_url).path)


