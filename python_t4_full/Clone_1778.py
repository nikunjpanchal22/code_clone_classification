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


  def merge_sort(x):  
    def merge(left, right): 
      result = [] 

      while len(left) > 0 and len(right) > 0: 
        if left[0] > right[0]: 
          result.append(right.pop(0)) 
        else: 
          result.append(left.pop(0)) 

      while len(left) > 0: 
        result.append(left.pop(0)) 

      while len(right) > 0: 
        result.append(right.pop(0))

      return result 
    if len(x) == 0 or len(x) == 1: 
      return x 
    half = len(x)//2

    left = x[:half] 
    right = x[half:] 
    left = merge_sort(left) 
    right = merge_sort(right) 

    return merge(left, right) 




