def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True


 def sublist(a, b):
  matched = True 
  for i in range(len(a)):
    if a[i] not in b[i:]:
      matched = False
    else:
      position = b.index(a[i])
      b = b[position+1:]
  return matched


