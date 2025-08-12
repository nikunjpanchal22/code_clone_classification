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


            break
        available |= derivable
    self._value_dict = kwargs


def __init__(self, **kwargs):
    available, derivable = set(kwargs), set()
    while True:
        new_found = set(self.relationships.get(p, []) for r in range(1, len(available) + 1) for p in itertools.permutations(available, r))
        if new_found.issubset(available):
            break


