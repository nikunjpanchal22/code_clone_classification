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
    groups = []
    min_samples = None
    for yi in np.unique(y):
        sample_groups = x[(y==yi)]
        groups.append((yi, sample_groups))
        if min_samples == None or sample_groups.shape[0]<min_samples:
            min_samples = sample_groups.shape[0]
    used_samples = min_samples
    if subsample_size < 1:
        used_samples = int(min_samples * subsample_size)
    xs = []
    ys = []
    for ci, group in groups:
        if len(group)>used_samples:
            np.random.shuffle(group)
        x_ = group[:used_samples]
        y_ = np.empty(used_samples)
        y_.fill(ci)
        xs.append(x_)
        ys.append(y_)
    xs = np.concatenate(xs)
    ys = np.concatenate(ys)
    return xs,ys
