def __call__(self, file) :
	hash = self.algorithm()
	with open(file, 'rb') as f :
		for chunk in iter(lambda : f.read(4096), '') :
			hash.update(chunk)
	return hash.hexdigest()


 def __call__(self, file) :
 	hash_string = self.algorithm()
 	strFile = open(file, 'rb')
 	chunk = True
 	while(chunk):
 		chunk = strFile.read(4096)
 		if(chunk):
 			hash_string.update(chunk)
 	strFile.close()
 	return hash_string.hexdigest()


