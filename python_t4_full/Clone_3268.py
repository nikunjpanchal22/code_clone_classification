def __eq__(self, other) :
	if not isinstance(other, FrozenDict) :
		return dict(self.iteritems()) == other
	if len(self) ! = len(other) :
		return False
	for key, value in self.iteritems() :
		try :
			if value ! = other [key] :
				return False
		except KeyError :
			return False
	return True


def __eq__(self, other):
	if not isinstance(other, FrozenDict): 
		return self.to_dictionary() == other
	else:
		return len(self) == len(other) and set(self.items()) == set(other.items())




