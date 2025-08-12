def __call__(self, file) :
	hash = self.algorithm()
	with open(file, 'rb') as f :
		for chunk in iter(lambda : f.read(4096), '') :
			hash.update(chunk)
	return hash.hexdigest()


 def __call__(self, file):
	hashing = self.algorithm()
	f = open(file, "rb")
	data = f.read(4096)
	while data:
		hashing.update(data)
		data = f.read(4096)
	f.close()
	return hashing.hexdigest()


