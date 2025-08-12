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


        self.next_index += 1 
    self.dataStore[key] = [index, value] 
    self.keyStore[index] = key 
    self.len += 1 




def __setitem__(self, key, value):
    if key in self.dict:
        self.dict[key][1] = value
    else:
        index = self.next if self.garbage is None else self.garbage[0]


