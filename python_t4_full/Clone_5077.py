def remove_item(todolist, name) :
	result = [item for item in todolist if name ! = item [1]]
	if len(todolist) == len(result) :
		return False
	else :
		return result




def remove_item(todolist, name):
    removed_list = list(filter(lambda x: x[1] != name, todolist))
    return False if len(removed_list) == len(todolist) else removed_list   



