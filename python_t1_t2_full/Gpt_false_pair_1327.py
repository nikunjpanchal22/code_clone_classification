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


 def merge(left, right, comparison):
  result = []
  left_index = 0
  right_index = 0 
  while left_index < len(left) and right_index < len(right):
    if comparison(left[left_index], right[right_index]):
      result.append(left[left_index])
      left_index += 1
    else:
      result.append(right[right_index])
      right_index += 1
  
  while left_index < len(left):
    result.append(left[left_index])
    left_index += 1
  
  while right_index < len(right):
    result.append(right[right_index])
    right_index += 1
  
  return result
