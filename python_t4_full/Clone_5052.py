def read(self, block_size = None) :
	block_size = block_size or self._block_size
	total_read = 0
	chunks = []
	for chunk in self._reader :
		chunks.append(chunk)
		total_read += len(chunk)
		if total_read > block_size :
			contents = ''.join(chunks)
			self._reader = chain([contents [block_size :]], self._reader)
			return contents [: block_size]
	return ''.join(chunks)


        chunks.append(chunk[:read_len])
        chunk = chunk[read_len:]
        total_read += read_len
    self._reader = chain([chunk], self._reader)
    return ''.join(chunks)


 

def read(self, block_size = None):
    if block_size == None:
        block_size = self._block_size
    chunks = []
    total_read = 0   


