def __init__(self, ** kwargs) :
	available = set(kwargs)
	derivable = set()
	while True :
		for r in range(1, len(available) + 1) :
			for permutation in itertools.permutations(available, r) :
				if permutation in self.relationships :
					derivable.add(self.relationships [permutation])
		if derivable.issubset(available) :
			break
		else :
			available |= derivable
	underivable = set(self.relationships.values()) - available
	if len(underivable) > 0 :
		raise TypeError(
		"The following properties cannot be derived:\n\t{0}"
		.format(tuple(underivable)))
	self._value_dict = kwargs


  def __init__(self, **kwargs):
	derivable = []
	for key in kwargs:
		if key in self.relationships:
			derivable.append(self.relationships[key])
	not_derivable = set(self.relationships.values()) - set(derivable)
	if len(not_derivable) > 0:
		raise TypeError("The following properties cannot be derived:\n\t{0}".format(tuple(not_derivable)))
	self._value_dict = kwargs


