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
    bins = []
    min_units = None
    for yi in np.unique(y):
        bins_units = x[(y==yi)]
        bins.append((yi, bins_units))
        if min_units == None or bins_units.shape[0]<min_units:
            min_units = bins_units.shape[0]
    used_units = min_units
    if subsample_size < 1:
        used_units = int(min_units * subsample_size)
    xs = []
    ys = []
    for ci, bin in bins:
        if len(bin)>used_units:
            np.random.shuffle(bin)
        x_ = bin[:used_units]
        y_ = np.empty(used_units)
        y_.fill(ci)
        xs.append(x_)
        ys.append(y_)
    xs = np.concatenate(xs)
    ys = np.concatenate(ys)
    return xs,ys
