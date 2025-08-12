def remove_item(todolist, name) :
	result = [item for item in todolist if name ! = item [1]]
	if len(todolist) == len(result) :
		return False
	else :
		return result



def remove_item(todolist, name) :
	index = 0
	for item in todolist :
		if item[1] == name :
			del todolist[index]
			return todolist
		index += 1


