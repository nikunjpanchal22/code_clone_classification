def unique(l) :
	s = set(); n = 0
	for x in l :
		if x not in s : s.add(x); l [n] = x; n += 1
	del l [n :]



 def unique(l) :
  s = {}; n = 0
  for val in l:
    if val not in s:
      s[val] = True
      l[n] = val
      n += 1


