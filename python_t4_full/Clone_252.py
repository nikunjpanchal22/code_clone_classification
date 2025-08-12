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
    derived = set() 
    for key in kwargs:
        for r in range(1, len(key) + 1):
            for permutation in itertools.permutations(key, r):
                if permutation in self.relationships:
                    derived.add(self.relationships[permutation])
    not_derived = set(self.relationships.values()) - derived - set(kwargs)
    
    if len(not_derived) > 0:
        raise TypeError("The following properties cannot be derived:\n\t{0}". format(tuple(not_derived)))

    self._value_dict = kwargs


