def findKmersSet(k, stuff) :
	result = []
	for inner_list in stuff :
		iterators = [iter(inner_list [i :]) for i in xrange(k)]
		result.append([''.join(triple) for triple in zip(* iterators)])
	return result




def findKmersSet(k, stuff) :
	result = []
	for inner_list in stuff :
		iterators = [iter(inner_list [i ::]) for i in range(k)]
		result.append([''.join(triple) for triple in zip(* iterators)])
	return result
