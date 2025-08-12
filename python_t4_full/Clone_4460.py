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





def merge(data, start, middle, end):
	x = data[start:middle+1]
	y = data[middle+1:end+1]
	i = j = 0
	k = start
	while i < len(x) and j < len(y):
		if x[i] <= y[j]:
			data[k] = x[i]
			i += 1
		else:
			data[k] = y[j]
			j += 1
		k += 1
	while i < len(x):
		data[k] = x[i]
		i += 1
		k += 1
	while j < len(y):
		data[k] = y[j]
		j += 1


