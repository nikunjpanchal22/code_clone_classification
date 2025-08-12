def unique(l) :
	s = set(); n = 0
	for x in l :
		if x not in s : s.add(x); l [n] = x; n += 1
	del l [n :]


#gpt output=============
 def unique(l) :
  s = set(); m = 0
  for x in l:
    if x not in s:
      s.add(x); l[m] = x
    m+=1


