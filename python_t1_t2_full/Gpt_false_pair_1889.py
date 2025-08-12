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
    class_elems = []
    smallest_num = None
    for yi in np.unique(y):
        x_ = x[(y==yi)]
        class_elems.append((yi, x_))
        if smallest_num == None or x_.shape[0]<smallest_num:
            smallest_num = x_.shape[0]
    used_num = smallest_num
    if subsample_size<1:
        used_num = int(smallest_num*subsample_size)
    xs = []
    ys = []
    for ci, elem in class_elems:
        if len(elem)>used_num:
            np.random.shuffle(elem)
        x_ = elem[:used_num]
        y_ = np.empty(used_num)
        y_.fill(ci)
        xs.append(x_)
        ys.append(y_)
    xs = np.concatenate(xs)
    ys = np.concatenate(ys)
    return xs,ys
