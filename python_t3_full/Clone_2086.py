def handle_request(req) :
	for i, h in enumerate(handlers) :
		if h [1].handles(req) :
			h [0] += 1
			for j in reversed(range(i + 1)) :
				if handlers [j] [0] < = h [0] :
					break
			if j < i :
				handlers [j + 1 : i + 1] = handlers [j : i]
				handlers [j] = h
			break
	else :
		return None
	return h [1]


		return None
	return obj[1]



def handle_req(q_req):
	for i, pair in enumerate(pair_handling_list):
		if pair[1].manages(q_req):
			pair[0] += 1
			for j in reversed(range(i + 1)):
				if pair_handling_list[j][0] <= pair[0]:
					break
			if j < i:
				pair_handling_list[j + 1 : i + 1] = pair_handling_list[j : i]
				pair_handling_list[j] = pair


