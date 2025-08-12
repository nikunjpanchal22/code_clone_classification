def powerset(items) :
	combo = []
	for r in range(len(items) + 1) :
		combo.append(list(combinations(items, r)))
	return combo


 def powerset(items) : 
	combo = []
	for r in range(1 << len(items)) :
		combo.append([item for item, bit in zip(items, bin(r)[2:].zfill(len(items))) if bit == '1'])
	return combo


