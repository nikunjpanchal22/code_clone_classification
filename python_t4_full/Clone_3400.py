def flatten(l) :
	for el in l :
		if isinstance(el, collections.Iterable) and not isinstance(el, basestring) :
			for sub in flatten(el) :
				yield sub
		else :
			yield el


import operator
import functools

def flatten(l):
    if isinstance(l, collections.abc.Iterable) and not isinstance(l, str):
        return functools.reduce(operator.iconcat, (flatten(i) for i in l), [])
    else:
        return [l]


