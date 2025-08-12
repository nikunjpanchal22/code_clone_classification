def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True


 def sublist(a, b):
  index = 0
  for digit in a:
    if digit not in b[index:]: 
        return False
    else:
        index = b.index(digit, index)+1 
  return True


