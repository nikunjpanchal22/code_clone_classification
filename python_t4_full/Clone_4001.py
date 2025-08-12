def find_neighbors(tess, points) :
	neighbors = {}
	for point in range(points.shape [0]) :
		neighbors [point] = []
	for simplex in tess.simplices :
		neighbors [simplex [0]] += [simplex [1], simplex [2]]
		neighbors [simplex [1]] += [simplex [2], simplex [0]]
		neighbors [simplex [2]] += [simplex [0], simplex [1]]
	return neighbors





def find_neighbors(tess, points):
    from collections import defaultdict
    neighbors = defaultdict(list)
    for simplex in tess.simplices:
        for i in range(3):
            neighbors[simplex[i]].extend(simplex[:i] + simplex[i + 1:])


