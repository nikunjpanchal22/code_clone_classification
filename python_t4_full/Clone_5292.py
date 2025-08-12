def unique(l) :
	s = set(); n = 0
	for x in l :
		if x not in s : s.add(x); l [n] = x; n += 1
	del l [n :]






def unique(lst):
   ret_list=[]
   [ret_list.append(i) for i in lst if i not in ret_list]


