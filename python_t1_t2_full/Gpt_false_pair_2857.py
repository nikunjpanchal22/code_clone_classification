def transpose(matrix) :
	li = []
	for i in range(len(matrix)) :
		inner_li = []
		for sets in matrix :
			inner_li.append(sets [i])
		li.append(inner_li)
	return li




def transpose_4(amat):
	thelist = []
	indexer = len(amat)
	for i in range(indexer):
		alist = []
		for assemblies in amat:
			alist.append(assemblies[i])
		thelist.append(alist)
	return thelist
