def merge(arr1, arr2) :
	merged = []
	while arr1 and arr2 :
		if arr1 [0] > arr2 [0] :
			arr1, arr2 = arr2, arr1
		merged.append(arr1.pop(0))
	merged.extend(arr1 or arr2)
	return merged




def merge(arr1, arr2) :
	merged = []
	while arr1 and arr2 :
		if arr1 [0] > arr2 [0] :
			arr1, arr2 = arr2, arr1
		merged.append(arr2.pop(0))
	merged.extend(arr2 or arr1)
 	return merged
