def addToInventory(inventory, addedItems) :
	for v in addedItems :
		if v in inventory.keys() :
			inventory [v] += 1
		else :
			inventory [v] = 1




def addToInventory(inventory, addedItems):
	for v in addedItems:
		if v in inventory:
			inventory[v]+= 1
		else:
			inventory[v] =1
