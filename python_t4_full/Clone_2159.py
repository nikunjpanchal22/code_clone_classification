def pairsum_n(list1, value) :
	set1 = set(list1)
	if list1.count(value / 2) < 2 :
		set1.remove(value / 2)
	return set((min(x, value - x), max(x, value - x)) for x in filterfalse(lambda x : (value - x) not in set1, set1))


 def pairsum_n(list1, value):
    lstsum = []
    list1 = list(set(list1)) 
    
    for x in list1:
        if value - x in list1:
            lstsum.append((min(x, value - x), max(x, value - x)))
    if list1.count(value/2) < 2:
        lstsum = list(set([pair for pair in lstsum if pair != (value/2,value/2)]))
    return set(lstsum)


