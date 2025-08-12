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


 def balanced_subsample(x, y, subsample_size=1.0):
	    from sklearn.utils import resample
	    min_elems = np.min([np.sum(y == i) for i in np.unique(y)])
	    if subsample_size < 1.0:
	        min_elems = int(min_elems * subsample_size)
	    xs = []
	    ys = []
	    for i in np.unique(y):
	        xx = resample(x[y == i], n_samples=min_elems)
	        yy = np.array([i]*min_elems)
	        xs.append(xx)
	        ys.append(yy)
	    xs = np.concatenate(xs)
	    ys = np.concatenate(ys)


