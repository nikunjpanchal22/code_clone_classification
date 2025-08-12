def __call__(self, file) :
	hash = self.algorithm()
	with open(file, 'rb') as f :
		for chunk in iter(lambda : f.read(4096), '') :
			hash.update(chunk)
	return hash.hexdigest()


 def __call__(self, file):
	hash_value = self.algorithm()
	file_handler = open(file,"rb")
	while True:
		chunk = file_handler.read(4096)
		if not chunk:
			break
		hash_value.update(chunk)
	file_handler.close()
	return hash_value.hexdigest()


