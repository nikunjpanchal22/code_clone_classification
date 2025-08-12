def merge(a, low, mid, high) :
	l = a [low : mid + 1]
	r = a [mid + 1 : high + 1]
	k = 0; i = 0; j = 0;
	c = [0 for i in range(low, high + 1)]
	while (i < len(l) and j < len(r)) :
		if (l [i] < = r [j]) :
			c [k] = (l [i])
			k += 1
			i += 1
		else :
			c [k] = (r [j])
			j += 1
			k += 1
	while (i < len(l)) :
		c [k] = (l [i])
		k += 1
		i += 1
	while (j < len(r)) :
		c [k] = (r [j])
		k += 1
		j += 1
	a [low : high + 1] = c


def merge(b, min, mid, max) :
	lt = b [min : mid + 1]
	rt = b [mid + 1 : max + 1]
	k = 0; x = 0; y = 0;
	d = [0 for x in range(min, max + 1)]
	while (x < len(lt) and y < len(rt)) :
		if (lt [x] < = rt [y]) :
			d [k] = (lt [x])
			k += 1
			x += 1
		else :
			d [k] = (rt [y])
			y += 1
			k += 1
	while (x < len(lt)) :
		d [k] = (lt [x])
		k += 1
		x += 1
	while (y < len(rt)) :
		d [k] = (rt [y])
		k += 1
		y += 1
	b [min : max + 1] = d

