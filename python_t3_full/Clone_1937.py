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


    self.size += 1




def __setitem__(self, key, value):
    if key in self.dict:
        self.dict[key][1] = value
        return
    if self.unlinkedList is None :
        index = self.currentIndex
        self.currentIndex += 1
    else :
        index = self.unlinkedList.pop(0)


