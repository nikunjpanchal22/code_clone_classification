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
    slots = []
    fewest_items = None
    for yi in np.unique(y):
        items = x[(y==yi)]
        slots.append((yi, items))
        if fewest_items == None or items.shape[0]<fewest_items:
            fewest_items = items.shape[0]
    used_items = fewest_items
    if subsample_size < 1:
        used_items = int(fewest_items * subsample_size)
    xs = []
    ys = []
    for ci, slot in slots:
        if len(slot)>used_items:
            np.random.shuffle(slot)
        x_ = slot[:used_items]
        y_ = np.empty(used_items)
        y_.fill(ci)
        xs.append(x_)
        ys.append(y_)
    xs = np.concatenate(xs)
    ys = np.concatenate(ys)
    return xs,ys
