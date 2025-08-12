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


 def merge(left, right, comparator):
  result = []
  left_pointer = 0
  right_pointer = 0
  
  while left_pointer < len(left) and right_pointer < len(right):
    if comparator(left[left_pointer], right[right_pointer]):
      result.append(left[left_pointer])
      left_pointer += 1
    else:
      result.append(right[right_pointer])
      right_pointer += 1
  
  while left_pointer < len(left):
    result.append(left[left_pointer])
    left_pointer += 1
  
  while right_pointer < len(right):
    result.append(right[right_pointer])
    right_pointer += 1
  
  return result
