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


 def merge(arr, low, mid, high) : 
	lStripe = arr[low: mid + 1]
	rStripe = arr[mid + 1 : high + 1]
	i = 0 
	j = 0
	k = 0 
	auxilary = [0 for x in range(low, high + 1)]
	while (i < len(lStripe) and j < len(rStripe)) :
		if (lStripe[i] <= rStripe[j]) : 
			auxilary[k] = lStripe[i]
			i += 1
			k += 1 
		else :
			auxilary[k] = rStripe[j]
			j += 1 
			k += 1
	while (i < len(lStripe)) :
		auxilary[k] = lStripe[i]
		k += 1
		i += 1
	while (j < len(rStripe)) : 
		auxilary[k] = rStripe[j]
		j += 1
		k += 1
	arr[low:high + 1] = auxilary
