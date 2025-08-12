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


    derivable = set()
    for length in range(1, len(available) + 1):
        for subset in itertools.permutations(available, length):
            if subset in self.relationships:
                derivable.add(self.relationships[subset])
    if not derivable <= available:
        available |= derivable
    self._value_dict = kwargs


def __init__(self, **kwargs):
    available = set(kwargs)
    while True:
        derivable = set()
        for r in range(1, len(available) + 1):
            for p in itertools.permutations(available, r):
                if p in self.relationships:
                    derivable.add(self.relationships[p])
        if derivable.issubset(available):
            break
        available |= derivable


