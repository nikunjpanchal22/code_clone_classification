def flatten(l) :
	for el in l :
		if isinstance(el, collections.Iterable) and not isinstance(el, basestring) :
			for sub in flatten(el) :
				yield sub
		else :
			yield el



 def flatten(arr):
  res = []
  for el in arr:
    if isinstance(el, collections.Iterable) and not isinstance(el, basestring):
      res += flatten(el)
    else:
      res.append(el)


