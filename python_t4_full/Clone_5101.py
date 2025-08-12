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


	super().save()



def save(self, *args, **kwargs):
	if self.image_url:
		import shutil
		import requests
		import os
		from urllib.parse import urlparse
		dest_directory = self.upload_path
		img_basename = os.path.basename(urlparse(self.image_url).path)
		response = requests.get(self.image_url, stream=True)
		with open(os.path.join(dest_directory, img_basename), 'wb') as out_file:
			shutil.copyfileobj(response.raw, out_file)


