def flatten(l) :
	for el in l :
		if isinstance(el, collections.Iterable) and not isinstance(el, basestring) :
			for sub in flatten(el) :
				yield sub
		else :
			yield el



 def flatten(arr):
  if not isinstance(arr, collections.Iterable) and not isinstance(arr, basestring):
    return [arr]
  result = []
  for el in arr:
    result.extend(flatten(el)) 


