def flatten(l) :
	for el in l :
		if isinstance(el, collections.Iterable) and not isinstance(el, basestring) :
			for sub in flatten(el) :
				yield sub
		else :
			yield el


 def flatten(l):
  inner_list = []
  for el in l:
    if isinstance(el, collections.Iterable) and not isinstance(el, basestring):
      inner_list.append(list(flatten(el)))
    else:
      inner_list.append(el)
  return list(itertools.chain(*inner_list))


