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
        import os, cURL
        
        file_save_dir = self.upload_path
        filename = self.image_url.split('/')[-1]
        
        curl = cURL.Curl()
        curl.setopt(cURL.URL, self.image_url)
        with open(os.path.join(file_save_dir, filename), 'wb') as f:
            curl.setopt(cURL.WRITEDATA, f)
            curl.perform()
        self.image = os.path.join(file_save_dir, filename)
        self.image_url = ''
    super(tweet_photos, self).save()


