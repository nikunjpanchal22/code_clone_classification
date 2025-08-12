def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True


 def sublist(a, b):
  start = 0
  flag = 0

  for i in a:
    start += flag
    flag = 0
    for j in range(start, len(b)):
      if b[j] == i:
        flag += 1
        break
    else:
      return False
  return True


