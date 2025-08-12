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


def combine(a, first, middle, last) :
	leftArr = a [first : middle + 1]
	rightArr = a [middle + 1 : last + 1]
	k = 0; m = 0; n = 0;
	temp = [0 for m in range(first, last + 1)]
	while (m < len(leftArr) and n < len(rightArr)) :
		if (leftArr [m] < = rightArr [n]) :
			temp [k] = (leftArr [m])
			k += 1
			m += 1
		else :
			temp [k] = (rightArr [n])
			n += 1
			k += 1
	while (m < len(leftArr)) :
		temp [k] = (leftArr [m])
		k += 1
		m += 1
	while (n < len(rightArr)) :
		temp [k] = (rightArr [n])
		k += 1
		n += 1
	a [first : last + 1] = temp

