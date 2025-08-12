def remove_item(todolist, name) :
	result = [item for item in todolist if name ! = item [1]]
	if len(todolist) == len(result) :
		return False
	else :
		return result



 def remove_item(todolist,name): 
	newlist = todolist[:]
	for i in range(len(newlist)):
		if newlist[i][1] == name:
			newlist.remove(newlist[i])
			return newlist


