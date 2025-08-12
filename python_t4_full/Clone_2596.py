def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True


 def sublist(a, b):
  ptr1 = 0
  ptr2 = 0
  while ptr1 < len(a) and ptr2 < len(b):
    if a[ptr1] == b[ptr2]:
      ptr1 += 1
      ptr2 += 1
    
    else:
      ptr2 += 1
  
  if ptr1 == len(a):
    return True
  else:
    return False


