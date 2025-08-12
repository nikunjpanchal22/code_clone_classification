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
		from urllib import request
		import os
		import re
		dest_path = self.upload_path
		filename = re.findall(r'/(?:([^/]+?))(?:\?|$)', self.image_url)[-1]
		request.urlretrieve(self.image_url, os.path.join(dest_path, filename))
		self.image = os.path.join(dest_path, filename)


