def balanced_subsample(x, y, subsample_size = 1.0) :
	class_xs = []
	min_elems = None
	for yi in np.unique(y) :
		elems = x [(y == yi)]
		class_xs.append((yi, elems))
		if min_elems == None or elems.shape [0] < min_elems :
			min_elems = elems.shape [0]
	use_elems = min_elems
	if subsample_size < 1 :
		use_elems = int(min_elems * subsample_size)
	xs = []
	ys = []
	for ci, this_xs in class_xs :
		if len(this_xs) > use_elems :
			np.random.shuffle(this_xs)
		x_ = this_xs [: use_elems]
		y_ = np.empty(use_elems)
		y_.fill(ci)
		xs.append(x_)
		ys.append(y_)
	xs = np.concatenate(xs)
	ys = np.concatenate(ys)
	return xs, ys




def balanced_subsample_type3(x, y, subsample_size = 1.0) :
	class_xs = []
	smallest_elems = None
	for yi in np.unique(y) :
		elements = x [(y == yi)]
		class_xs.append((yi, elements))
		if smallest_elems == None or elements.shape [0] < smallest_elems :
			smallest_elems = elements.shape [0]
	use_elements = smallest_elems
	if subsample_size < 1 :
		use_elements = int(smallest_elems * subsample_size)
	arrays = []
	values= []
	for ci, this_xs in class_xs :
		if len(this_xs) > use_elements :
			np.random.shuffle(this_xs)
		x_ = this_xs [: use_elements]
		y_ = np.empty(use_elements)
		y_.fill(ci)
		arrays.append(x_)
		values.append(y_)
	arrays = np.concatenate(arrays)
	values = np.concatenate(values)
	return arrays, values
