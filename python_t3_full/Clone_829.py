def __call__(self, file) :
	hash = self.algorithm()
	with open(file, 'rb') as f :
		for chunk in iter(lambda : f.read(4096), '') :
			hash.update(chunk)
	return hash.hexdigest()


 def __call__(self, file):	
	hash = self.algorithm()
	with open(file, "rb") as f:
		buffer = f.read(4096)
		while buffer:
			hash.update(buffer)
			buffer = f.read(4096)
	return hash.hexdigest()


