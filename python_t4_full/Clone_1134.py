def __call__(self, file) :
	hash = self.algorithm()
	with open(file, 'rb') as f :
		for chunk in iter(lambda : f.read(4096), '') :
			hash.update(chunk)
	return hash.hexdigest()


 def __call__(self, file) :
	hashed_val = self.algorithm()
	fp = open(file, 'rb')
	while True :
		chunk = fp.read(4096)
		if not chunk :
			break
		hashed_val.update(chunk)
	fp.close()
	return hashed_val.hexdigest()


