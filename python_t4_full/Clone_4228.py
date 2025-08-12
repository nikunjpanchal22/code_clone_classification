def deep_reverse(a) :
	a.reverse()
	for i in a :
		if is_list(i) :
			deep_reverse(i)
			print a



def deep_reverse(lst):
    def rev(e): return deep_reverse(e) if isinstance(e, list) else e
    lst.reverse()
    return [rev(e) for e in lst]





