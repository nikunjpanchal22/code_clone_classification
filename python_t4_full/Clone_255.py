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
    derivable_keys = set()
    for permutation in itertools.permutations(kwargs.keys()):
        if permutation in self.relationships:
            if self.relationships[permutation] not in derivable_keys:
                derivable_keys.add(self.relationships[permutation])
    underivable_keys = set(self.relationships.values()) - derivable_keys - set(kwargs)
    
    if len(underivable_keys) > 0:
        raise TypeError("The following properties cannot be derived:\n\t{0}". format(tuple(underivable_keys)))

    self._value_dict = kwargs


