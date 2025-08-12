def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True




def sublist(a, b):
  start = 0
  for el_a in a:
    if el_a in b[start:]:
      start=b.index(el_a, start)+1
    else:
      return False
  return True
