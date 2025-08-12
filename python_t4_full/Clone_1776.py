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
  
    def merge(left_arr, right_arr):
      result = []
      left_index = 0
      right_index = 0
      while left_index < len(left_arr) and right_index < len(right_arr):
          if left_arr[left_index] > right_arr[right_index]:
              result.append(right_arr[right_index])
              right_index += 1
          else:
              result.append(left_arr[left_index])
              left_index += 1
      result.extend(left_arr[left_index:])
      result.extend(right_arr[right_index:])
      return result
    if len(arr) < 2:
        return arr
    mid_index = int(len(arr) / 2)
    left_arr = arr[:mid_index]
    right_arr = arr[mid_index:]
    left_arr = merge_sort(left_arr)
    right_arr = merge_sort(right_arr)
    return merge(left_arr, right_arr)




