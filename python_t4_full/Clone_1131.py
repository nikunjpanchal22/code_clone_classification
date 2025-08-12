def __call__(self, file) :
	hash = self.algorithm()
	with open(file, 'rb') as f :
		for chunk in iter(lambda : f.read(4096), '') :
			hash.update(chunk)
	return hash.hexdigest()


 def __call__(self, file) :
	hash_num = self.algorithm()
	temp = open(file, "rb")
	while True :
		byte_block = temp.read(4096)
		if not byte_block :
			break
		hash_num.update(byte_block)
	temp.close()
	return hash_num.hexdigest()


