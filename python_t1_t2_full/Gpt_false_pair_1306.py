def merge(a, low, mid, high) :
	l = a [low : mid + 1]
	r = a [mid + 1 : high + 1]
	k = 0
 	i = 0
  	j = 0
	c = [0 for i in range(low, high + 1)]
	while (i < len(l) and j < len(r)) :
		if (l [i] <= r [j]) :
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


 def merge (a, low, mid, high) : 
	left = a[low:mid + 1]
	right = a[mid + 1 : high + 1]
	i = 0 
	j = 0 
	k = 0 
	c = [0 for n in range(low, high + 1)]
	while (i < len(left) and j < len(right)) : 
		if (left[i] <= right[j]) :
			c[k] = left[i] 
			i += 1
			k += 1
		else :
			c[k] = right[j]
			j += 1
			k += 1
	while (i < len(left)) : 
		c[k] = left[i] 
		k += 1
		i += 1
	while (j < len(right)) : 
		c[k] = right[j]
		k += 1
		j += 1
	a[low:high+1] = c

