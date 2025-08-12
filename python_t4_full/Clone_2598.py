def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True


 def sublist(a, b):
  first = 0
  last = 0 
  while last < len(b):
    if b[last] == a[first] :
      first += 1
      last += 1
    else:
      last += 1
    if first == len(a):
      return True
  return False


