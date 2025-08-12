def flatten(l) :
	for el in l :
		if isinstance(el, collections.Iterable) and not isinstance(el, basestring) :
			for sub in flatten(el) :
				yield sub
		else :
			yield el




import numpy as np

def flatten(l):
    return np.array(l).flatten().tolist()


 

def flatten(l):
    result = []
    stack = list(reversed(l))



