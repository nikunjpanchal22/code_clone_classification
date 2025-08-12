def merge_sort(x) :
	if len(x) < 2 : return x
	result, mid = [], int(len(x) / 2)
	y = merge_sort(x [: mid])
	z = merge_sort(x [mid :])
	while (len(y) > 0) and (len(z) > 0) :
		if y [0] > z [0] : result.append(z.pop(0))
		else : result.append(y.pop(0))
	result.extend(y + z)
	return result


  def merge_sort(arr):
    def merge(left, right): 
      result = [] 

      while len(left) > 0 and len(right) > 0: 
        if left[0] < right[0]: 
          result.append(left[0])
          left.pop(0)
        else: 
          result.append(right[0])
          right.pop(0)
      
      while len(left) > 0:
        result.append(left[0])
        left.pop(0)

      while len(right) > 0: 
        result.append(right[0])
        right.pop(0)

      return result
    # Base case
    if len(arr) < 2: 
      return arr 

    # Index of the splitting point
    mid = len(arr) // 2 

    # Recursive calls to sort each half 
    left = merge_sort(arr[:mid]) 
    right = merge_sort(arr[mid:])

    # Merge two sorted halves
    sorted_arr = merge(left, right) 
    return sorted_arr




