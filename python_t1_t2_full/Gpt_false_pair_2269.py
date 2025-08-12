def find_neighbors(tess, points) :
	neighbors = {}
	for point in range(points.shape [0]) :
		neighbors [point] = []
	for simplex in tess.simplices :
		neighbors [simplex [0]] += [simplex [1], simplex [2]]
		neighbors [simplex [1]] += [simplex [2], simplex [0]]
		neighbors [simplex [2]] += [simplex [0], simplex [1]]
	return neighbors




def locate_neighbors(tess, positions) :
	neighbor_locations = {}
	for position in range(positions.shape [0]) :
		neighbor_locations [position] = []
	for simplex in tess.simplices :
		neighbor_locations [simplex [0]] += [simplex [1], simplex [2]]
		neighbor_locations [simplex [1]] += [simplex [2], simplex [0]]
		neighbor_locations [simplex [2]] += [simplex [0], simplex [1]]
	return neighbor_locations
