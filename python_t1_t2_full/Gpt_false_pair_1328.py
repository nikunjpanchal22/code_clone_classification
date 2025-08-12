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


 def merge(list_left, list_right, comparison):
  index_left = 0
  index_right = 0
  merged_list = []

  while index_left < len(list_left) and index_right < len(list_right):
    if comparison(list_left[index_left], list_right[index_right]):
      merged_list.append(list_left[index_left])
      index_left += 1
    else:
      merged_list.append(list_right[index_right])
      index_right += 1
  
  while index_left < len(list_left):
    merged_list.append(list_left[index_left])
    index_left += 1
  
  while index_right < len(list_right):
    merged_list.append(list_right[index_right])
    index_right += 1
  
  return merged_list
