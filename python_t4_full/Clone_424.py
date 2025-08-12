def flatten(l) :
	for el in l :
		if isinstance(el, collections.Iterable) and not isinstance(el, basestring) :
			for sub in flatten(el) :
				yield sub
		else :
			yield el


 def flatten(lst):
  flattened_list = []
  for element in lst:
    if type(element) is list:
      flattened_list += flatten(element)
    else:
      flattened_list.append(element)
  return flattened_list


