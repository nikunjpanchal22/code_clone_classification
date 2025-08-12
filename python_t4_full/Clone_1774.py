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
        merged_arr = [] 
        left_i, right_i = 0, 0
        while left_i < len(left) and right_i < len(right):
          if left[left_i] < right[right_i]:
            merged_arr.append(left[left_i])
            left_i += 1
          else: 
            merged_arr.append(right[right_i])
            right_i += 1
        while left_i < len(left):
          merged_arr.append(left[left_i]) 
          left_i += 1
        while right_i < len(right):
          merged_arr.append(right[right_i]) 
          right_i +=1
        
        return merged_arr
    if len(arr) <= 1: 
      return arr
    mid = len(arr)//2
    left = arr[:mid] 
    right = arr[mid:] 
    left = merge_sort(left) 
    right = merge_sort(right) 
    return merge(left, right) 




