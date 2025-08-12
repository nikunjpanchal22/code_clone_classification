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
	for num, handler in enumerate(handlers):
		if handler[1].handles(req):
			handler[0] += 1
			for j in reversed(range(num + 1)):
				if handlers[j][0] <= handler[0]:
					break
			if j < num:
				handlers[j+1 : num + 1] = handlers[j : num]
				handlers[j] = handler
			break
	else:
		return None
	return handler[1]
