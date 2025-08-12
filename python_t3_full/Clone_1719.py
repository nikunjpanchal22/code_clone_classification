def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True


 def sublist(a, b):
  search = 0 
  for item_a in a : 
    for i in range (search, len (b)) : 
      if item_a == b [i] : 
        search += i+1
        break
    else : 
      return False
  return True


