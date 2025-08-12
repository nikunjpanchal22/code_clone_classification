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
    #base case:
    if len(x) == 1:
        return x
    else :
        mid = int(len(x)/2)
        l = merge(x[:mid])
        r = merge(x[mid:])
        i = j = 0
        result = []
        while i < len(l) and j < len(r):
            if l[i] != r[j]:
                if l[i] < r[j]:
                    result.append(l[i])
                    i += 1
                else:
                    result.append(r[j])
                    j += 1
            else:
                result.append(l[i])
                result.append(r[j])
                i += 1
                j += 1
        result += l[i:]
        result += r[j:]


