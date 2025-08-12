def flatten(l) :
	for el in l :
		if isinstance(el, collections.Iterable) and not isinstance(el, basestring) :
			for sub in flatten(el) :
				yield sub
		else :
			yield el



 def flatten(list): 
  result = []
  for el in list:
    if isinstance(el, collections.Iterable) and not isinstance(el, basestring): 
      result.extend(flatten(el)) 
    else: 
      result.append(el)


