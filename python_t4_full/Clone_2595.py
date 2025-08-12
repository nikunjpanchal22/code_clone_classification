def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True


 def sublist(a, b): 
  flag = 0
  i = 0
    
  while i<len(b): 
    j = 0
    while j<len(a) and i<len(b) and a[j] == b[i]: 
       j += 1
       i += 1
     
    if j == len(a): 
      flag = 1
          
    i += 1
     
  if flag == 1: 
    return True 
  else: 
    return False


