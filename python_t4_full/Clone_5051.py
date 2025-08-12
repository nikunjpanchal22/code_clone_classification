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


            return chunks[:block_size]
    return chunks


 

def read(self, block_size = None):
    block_size = block_size or self._block_size
    total_read, chunks = 0, []
    reader = iter(self._reader)
    for chunk in reader:
        chunks.append(chunk)
        total_read += len(chunk)


