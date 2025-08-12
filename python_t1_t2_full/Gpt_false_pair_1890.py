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


  def balanced_subsample(x, y, subsample_size = 0) :
    classes = []
    least_elems = None
    for yi in np.unique(y):
        elem = x[(y==yi)]
        classes.append((yi, elem))
        if least_elems == None or elem.shape[0]<least_elems:
            least_elems = elem.shape[0]
    used_elems = least_elems
    if subsample_size<1:
        used_elems = int(least_elems*subsample_size)
    xs = []
    ys = []
    for ci, element in classes:
        if len(element)>used_elems:
            np.random.shuffle(element)
        x_ = element[:used_elems]
        y_ = np.empty(used_elems)
        y_.fill(ci)
        xs.append(x_)
        ys.append(y_)
    xs = np.concatenate(xs)
    ys = np.concatenate(ys)
    return xs,ys
