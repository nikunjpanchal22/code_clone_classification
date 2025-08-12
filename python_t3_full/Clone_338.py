def flatten(l) :
	for el in l :
		if isinstance(el, collections.Iterable) and not isinstance(el, basestring) :
			for sub in flatten(el) :
				yield sub
		else :
			yield el



 def flatten(array):
  new_array = []
  for item in array:
    if isinstance(item, collections.Iterable) and not isinstance(item, basestring):
      new_array += flatten(item)
    else:
      new_array.append(item)


