def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True


 def sublist(a,b): 
  for i in range(len(b)): 
    for j in range(len(a)): 
      if a[j] != b[i+j] : 
        break
    if j == len(a)-1 : 
      return True
  return False


