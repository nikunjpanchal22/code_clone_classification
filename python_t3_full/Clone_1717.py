def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True


 def sublist(a, b):
  mark = 0 
  for i in a:
    if i in b[mark:]:
      idx_a = a.index(i)
      idx_b = b.index(i)
      if idx_a == idx_b:
        mark += 1
      else:
        return False
    else:
      return False
  return True


