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



 

def read(self, block_size = None):
    if not block_size:
        block_size = self._block_size
    contents, total_read = '', 0
    while total_read <= block_size:
        try:
            chunk = next(self._reader)
            total_read += len(chunk)
            contents += chunk
        except StopIteration:
            break
    self._reader = chain([contents[block_size:]], self._reader)


