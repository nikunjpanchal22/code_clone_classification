def __call__(self, file) :
	hash = self.algorithm()
	with open(file, 'rb') as f :
		for chunk in iter(lambda : f.read(4096), '') :
			hash.update(chunk)
	return hash.hexdigest()


  def __call__(self, file) :
	hash_value = self.algorithm()
	try :
		f = open(file, 'rb')
		while True :
			piece = f.read(4096)
			if not piece :
				break
			hash_value.update(piece)
		return hash_value.hexdigest()
	finally :
		f.close()


