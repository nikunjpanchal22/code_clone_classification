def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True


 def sublist(a, b):
  for el_a in a:
    valid = False
    for el_b in b:
      if el_a == el_b:
        valid = True
        break
    if not valid:
      return False
  return True


