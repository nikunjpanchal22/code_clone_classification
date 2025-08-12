def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True


 def sublist(a, b):
  flag = False
  for x in a:
    for y in range(len(b)):
      if x == b[y]:
        flag = True
        break
      else:
        continue
    if flag == False:
      return False
    else:
      flag = False
  return True


