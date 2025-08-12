def __setitem__(self, key, value) :
	if key in self.dictionary :
		self.dictionary [key] [1] = value
		return
	if self.removed_indices is None :
		index = self.next_index
		self.next_index += 1
	else :
		index = self.removed_indices [0]
		self.removed_indices = self.removed_indices [1]
	self.dictionary [key] = [index, value]
	self.indexdict [index] = key
	self.len += 1


 def __setitem__(self, key, value):
		if key in self.dictionary:
			self.dictionary[key][1] = value
			return
		if len(self.removed_indices) == 0:
			index = self.next_index
			self.next_index += 1
		else:
			index = self.removed_indices.pop()
		self.dictionary[key] = [index, value]
		self.indexdict[index] = key
		self.len += 1
