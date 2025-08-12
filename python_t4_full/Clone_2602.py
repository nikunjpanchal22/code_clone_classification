def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True


 def sublist(a,b): 
  length = len(b) 
  
  for i in range(length): 
    if a == b[i:i+len(a)]: 
      return True
    
  return False


