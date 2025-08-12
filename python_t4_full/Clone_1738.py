def merge_sort(arr) :
	if len(arr) < 2 :
		return arr
	half = len(arr) / / 2
	left = merge_sort(arr [: half])
	right = merge_sort(arr [half :])
	out = []
	li = ri = 0
	while True :
		if li >= len(left) :
			out.extend(right [ri :])
			break
		if ri >= len(right) :
			out.extend(left [li :])
			break
		if left [li] < right [ri] :
			out.append(left [li])
			li += 1
		else :
			out.append(right [ri])
			ri += 1
	return out


 def merge_sort(arr):
    def merge(left, right):
      sorted_arr = []
      li = ri = 0
      while True:
        if li > len(left) - 1 or ri > len(right) - 1:
          break
        if left[li] < right[ri]:
          sorted_arr.append(left[li])
          li += 1
        else:
          sorted_arr.append(right[ri])
          ri += 1
      sorted_arr.extend(left[li:])
      sorted_arr.extend(right[ri:])

      return sorted_arr
    if len(arr) < 2:
      return arr
    else:
      mid = len(arr) // 2
      left = arr[:mid]
      right = arr[mid:]
      left_arr = merge_sort(left)
      right_arr = merge_sort(right)

      return merge(left_arr, right_arr)

  


