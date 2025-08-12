def remove_item(todolist, name) :
	result = [item for item in todolist if name ! = item [1]]
	if len(todolist) == len(result) :
		return False
	else :
		return result




def remove_item(todolist, name):
    res_list = []
    for item in todolist:
        if item[1] != name:
            res_list.append(item)
    return False if len(res_list) == len(todolist) else res_list


