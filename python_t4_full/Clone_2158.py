def pairsum_n(list1, value) :
	set1 = set(list1)
	if list1.count(value / 2) < 2 :
		set1.remove(value / 2)
	return set((min(x, value - x), max(x, value - x)) for x in filterfalse(lambda x : (value - x) not in set1, set1))


  def pairsum_n(list1,value) :
    set1 = set(list1)
    if list1.count(value/2) < 2 :
        set1.remove(value/2)
    trr = []
    tpl = []
    for x in set1 :
        trr.append([x, value-x])
    trr.sort()
    for each in trr :
        tpl.append(tuple([each[0],each[1]]))
    return set((min(x, value - x), max(x, value - x)) for x in filterfalse(lambda x : (value - x) not in set1, set1)), set(tpl)



