def merge(x) :
	if len(x) == 1 :
		return x
	else :
		mid = int(len(x) / 2)
		l = merge(x [: mid])
		r = merge(x [mid :])
	i = j = 0
	result = []
	while i < len(l) and j < len(r) :
		if l [i] < r [j] :
			result.append(l [i])
			i += 1
		else :
			result.append(r [j])
			j += 1
	result += l [i :]
	result += r [j :]
	return result




def merge(x):
  if len(x) == 1:
    return x
  else:
    mid = int(len(x)/2)
    a = merge(x[:mid])
    b= merge(x[mid:])
    i = j = 0
    result = []
    while i< len(a) and j < len(b):
      if a[i] < b[j]:
        result.append(a[i])
        i += 1
      else:
        result.append(b[j])
        j += 1
    result += a[i:]
    result += b[j:]
    return result
