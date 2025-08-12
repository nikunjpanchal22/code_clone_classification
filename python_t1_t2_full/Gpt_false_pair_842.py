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
    for index, item in enumerate(handlers):
        if item[1].handles(req):
            item[0] += 1
            temp_index = -1
            for j in reversed(range(index +1)):
                if handlers[j][0] <= item[0]:
                    temp_index = j
                    break
            if temp_index < index:
                handlers[temp_index + 1:index + 1] = handlers[temp_index:index]
                handlers[temp_index] = item
            break
        else:
            return None
