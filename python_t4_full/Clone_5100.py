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



def save(self, *args, **kwargs):
	if self.image_url:
		import requests
		import os
		from urllib.parse import urlparse
		file_save_dir = self.upload_path
		image_name = urlparse(self.image_url).path.split('/')[-1]
		response = requests.get(self.image_url)
		with open(os.path.join(file_save_dir, image_name), 'wb') as out_file:
			out_file.write(response.content)
		self.image = os.path.join(file_save_dir, image_name)
		self.image_url = ''
	super().save()


