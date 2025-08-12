def flatten(l) :
	for el in l :
		if isinstance(el, collections.Iterable) and not isinstance(el, basestring) :
			for sub in flatten(el) :
				yield sub
		else :
			yield el


 def flatten(givenList):
  result = []
  for x in givenList:
    if isinstance(x, list):
      result.extend(flatten(x))
    else:
      result.append(x)
  return result


