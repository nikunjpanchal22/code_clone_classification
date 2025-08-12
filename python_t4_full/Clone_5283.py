def select_weighted(d) :
	total = 0
	for key in d :
		total = total + len(d [key])
	accept_prob = float(1.0 / total)
	n_seen = 0
	for key in d :
		current_key = key
		for val in d [key] :
			dice_roll = random.random()
			accept_prob = float(1.0 / (total - n_seen))
			n_seen = n_seen + 1
			if dice_roll < = accept_prob :
				return current_key



def select_weighted(d):
    keys = []
    for k, i in d.items():
        keys.extend([k]*len(i))
    return random.choice(keys)




def select_weighted(d):
    tuples = [(key, len(val)) for key, val in d.items()]


