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
    segments = []
    least_elem = None
    for yi in np.unique(y):
        elements = x[(y==yi)]
        segments.append((yi, elements))
        if least_elem == None or elements.shape[0]<least_elem:
            least_elem = elements.shape[0]
    used_elem = least_elem
    if subsample_size < 1:
        used_elem = int(least_elem * subsample_size)
    xs = []
    ys = []
    for ci, segment in segments:
        if len(segment)>used_elem:
            np.random.shuffle(segment)
        x_ = segment[:used_elem]
        y_ = np.empty(used_elem)
        y_.fill(ci)
        xs.append(x_)
        ys.append(y_)
    xs = np.concatenate(xs)
    ys = np.concatenate(ys)
    return xs,ys
