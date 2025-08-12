def merge(left, right, compare) :
	result = []
	i, j = 0, 0
	while i < len(left) and j < len(right) :
		if compare(left [i], right [j]) :
			result.append(left [i])
			i += 1
		else :
			result.append(right [j])
			j += 1
	while i < len(left) :
		result.append(left [i])
		i += 1
	while j < len(right) :
		result.append(right [j])
		j += 1
	return result


 def merge(lst1, lst2, compare):
  result, l1, l2 = [], 0, 0

  while l1 < len(lst1) and l2 < len(lst2):
    if compare(lst1[l1], lst2[l2]):
      result.append(lst1[l1])
      l1 += 1
    else:
      result.append(lst2[l2])
      l2 += 1

  result += lst1[l1:]
  result += lst2[l2:]

  return result


