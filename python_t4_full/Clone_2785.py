def unique(l) :
	s = set(); n = 0
	for x in l :
		if x not in s : s.add(x); l [n] = x; n += 1
	del l [n :]



 def unique(l) :
  s = set(); j = 0
  for x in l:
    if x not in s:
      s.add(x)
      if j != len(l):
        l[j] = l[-1]
      l.pop()


