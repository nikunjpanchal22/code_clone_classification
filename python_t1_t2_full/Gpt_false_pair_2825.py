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




def handle_request(req):
	for count, h in enumerate(handlers):
		if h[1].handles(req):
			h[0] += 1
			for j in reversed(range(count + 1)):
				if handlers[j][0] <= h[0]:
					break
			if j < count:
				handlers[j+1 : count + 1] = handlers[j : count]
				handlers[j] = h
			break
	else:
		return None
	return h[1]
