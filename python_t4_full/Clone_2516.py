def remove_item(todolist, name) :
	result = [item for item in todolist if name ! = item [1]]
	if len(todolist) == len(result) :
		return False
	else :
		return result


#gpt output=============
 def remove_item(todolist, name) : 
	removed = False
	new_list = []
	for item in todolist :
		if item[1] != name :
			new_list.append(item)
		else :
			removed=True
	if removed :
		return new_list
	else :
		return False


