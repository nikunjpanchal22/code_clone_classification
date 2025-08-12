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


 def handle_request(req) :
    for handler_index, handler_value in enumerate(handlers):
        if handler_value[1].handles(req):
            handler_value[0] += 1

            for reversed_index in reversed(range(handler_index + 1)):
                if handlers[reversed_index][0] <= handler_value[0]:
                    break

            if reversed_index < handler_index:  # if break occured, then this condition will be true otherwise false
                handlers[reversed_index + 1:handler_index + 1] = handlers[reversed_index:handler_index]
                handlers[reversed_index] = handler_value

            break
        else:
            return None
