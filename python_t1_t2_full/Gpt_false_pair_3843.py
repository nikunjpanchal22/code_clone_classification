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




def balanced_subsample_type4(x, y, subsample_size = 1.0) :
	groups = []
	smallest_num = None
	for yi in np.unique(y) :
		result = x [(y == yi)]
		groups.append((yi, result))
		if smallest_num == None or result.shape [0] < smallest_num :
			smallest_num = result.shape [0]
	using_num = smallest_num
	if subsample_size < 1 :
		using_num = int(smallest_num * subsample_size)
	arrs = []
	vals= []
	for ci, this_xs in groups :
		if len(this_xs) > using_num :
			np.random.shuffle(this_xs)
		x_ = this_xs [: using_num]
		y_ = np.empty(using_num)
		y_.fill(ci)
		arrs.append(x_)
		vals.append(y_)
	arrs = np.concatenate(arrs)
	vals = np.concatenate(vals)
	return arrs, vals
