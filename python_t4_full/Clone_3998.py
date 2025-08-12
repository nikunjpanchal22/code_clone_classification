def find_neighbors(pindex, triang) :
	neighbors = list()
	for simplex in triang.vertices :
		if pindex in simplex :
			neighbors.extend([simplex [i] for i in range(len(simplex)) if simplex [i] ! = pindex])
			'''
			this is a one liner for if a simplex contains the point we`re interested in,
			extend the neighbors list by appending all the *other* point indices in the simplex
			'''
	return list(set(neighbors))





def find_neighbors(pindex, triang):
    nbs = []
    [nbs.extend([s[i] for i in range(len(s)) if s[i] != pindex]) for s in triang.vertices if pindex in s]
    return list(set(nbs))


