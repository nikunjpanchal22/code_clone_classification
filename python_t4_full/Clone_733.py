def powerset(items) :
	combo = []
	for r in range(len(items) + 1) :
		combo.append(list(combinations(items, r)))
	return combo



def powerset(items) :
	combo = [[]]
	for item in items :
		# Generate combinations
		new_combo = [ c + [ item ] for c in combo ]
		# Add the new combinations
		combo.extend(new_combo)


