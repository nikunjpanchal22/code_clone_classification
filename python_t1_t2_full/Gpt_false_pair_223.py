def addToInventory(inventory, addedItems) :
	for v in addedItems :
		if v in inventory.keys() :
			inventory [v] += 1
		else :
			inventory [v] = 1


def addToInventory(inventory, addedItems) :
	for v in addedItems :
		# If item in inventory
		if v in inventory :
			# Increment value
			inventory[v] += 1
		# If item not in inventory
		else :
			inventory[v] = 1		
	
