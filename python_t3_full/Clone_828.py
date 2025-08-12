def __call__(self, file) :
	hash = self.algorithm()
	with open(file, 'rb') as f :
		for chunk in iter(lambda : f.read(4096), '') :
			hash.update(chunk)
	return hash.hexdigest()


 def __call__(self, file) :
	calculated = self.algorithm()
	with open(file, 'rb') as f :
		chunk = f.read(4096)
		while len(chunk) > 0:
			calculated.update(chunk)
			chunk = f.read(4096)
	return calculated.hexdigest()


