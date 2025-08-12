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


 def save(self, * args, ** kwargs) :
    if self.image_url:
        import wget

        file_save_dir = self.upload_path
        filename = self.image_url.split('/')[-1]
        
        wget.download(self.image_url, out=os.path.join(file_save_dir, filename))
        self.image = os.path.join(file_save_dir, filename)
        self.image_url = ''
    super(tweet_photos, self).save()


