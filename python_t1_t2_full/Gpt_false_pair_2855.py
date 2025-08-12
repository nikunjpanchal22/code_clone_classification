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


def merge_4(a, low, mid, high) :
	left_list = a[low : mid + 1]
	right_list = a[mid + 1 : high + 1]
	i = 0; j = 0; k = 0;
	temp_list = [0 for x in range(low, high + 1)]
	while (i < len(left_list) and j < len(right_list)) :
		if (left_list [i] <= right_list[j]) :
			temp_list[k] = left_list [i]
			i+=1
		else :
			temp_list[k] = right_list[j]
			j+=1
		k+=1
	while (i < len(left_list)) :
		temp_list[k] = left_list [i]
		k+=1
		i+=1
	while (j < len(right_list)) :
		temp_list[k] = right_list[j]
		k+=1
		j+=1
	a[low : high + 1] = temp_list

