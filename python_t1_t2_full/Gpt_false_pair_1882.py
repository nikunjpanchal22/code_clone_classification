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
    min_elements = None
    for yi in np.unique(y):
        elements = x[(y==yi)]
        classes.append((yi, elements))
        if min_elements == None or elements.shape[0]<min_elements:
            min_elements = elements.shape[0]
    used_elements = min_elements
    if subsample_size < 1:
        used_elements = int(min_elements * subsample_size)
    xs = []
    ys = []
    for ci, elements in classes:
        if len(elements)>used_elements:
            np.random.shuffle(elements)
        x_ = elements[:used_elements]
        y_ = np.empty(used_elements)
        y_.fill(ci)
        xs.append(x_)
        ys.append(y_)
    xs = np.concatenate(xs)
    ys = np.concatenate(ys)
    return xs,ys
