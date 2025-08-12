def powerset(items) :
	combo = []
	for r in range(len(items) + 1) :
		combo.append(list(combinations(items, r)))
	return combo



def powerset(items) :
	combo = [[]]   # Start with empty combination
	for item in items :
		# Add combinations for each item
		latest_combo = []
		for combo in combo:
			latest_combo.append(list(combo))
			combination = combo + [item]
			latest_combo.append(combination)
		combo = latest_combo


