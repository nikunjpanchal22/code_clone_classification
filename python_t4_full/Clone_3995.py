def __call__(self, file) :
	hash = self.algorithm()
	with open(file, 'rb') as f :
		for chunk in iter(lambda : f.read(4096), '') :
			hash.update(chunk)
	return hash.hexdigest()


    self.algorithm().update(content)
    return self.algorithm().hexdigest()




def __call__(self, file):
    hash = self.algorithm()
    f = open(file, 'rb')
    chunk = f.read(4096)


