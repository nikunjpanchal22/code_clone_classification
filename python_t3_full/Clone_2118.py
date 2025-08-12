def __call__(self, file) :
	hash = self.algorithm()
	with open(file, 'rb') as f :
		for chunk in iter(lambda : f.read(4096), '') :
			hash.update(chunk)
	return hash.hexdigest()




def __call__(self, file):
    hash = self.algorithm()
    for chunk in iter(lambda : open(file, 'rb').read(4096), ''):
        hash.update(chunk)
    return hash.hexdigest()






