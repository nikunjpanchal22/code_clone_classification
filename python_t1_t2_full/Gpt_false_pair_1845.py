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


 def read(self, block_size = None) :
	block_size = block_size or self._block_size
	total_read = 0
	aggregation = []
	for chunk in self._reader :
		aggregation.append(chunk)
		total_read += len(chunk)
		if total_read > block_size :
			contents = ''.join(aggregation)
			self._reader = chain([contents [block_size :]], self._reader)
			return contents [: block_size]
	return ''.join(aggregation)
