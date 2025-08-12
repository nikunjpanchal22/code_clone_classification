def remove_item(todolist, name) :
	result = [item for item in todolist if name ! = item [1]]
	if len(todolist) == len(result) :
		return False
	else :
		return result




def remove_item(todolist, name) :
	result = [item for item in todolist if name != item[1]]
	if len(todolist) == 0 :
		return False
	else :
		return result
