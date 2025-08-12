def addToInventory(inventory, addedItems) :
	for v in addedItems :
		if v in inventory.keys() :
			inventory [v] += 1
		else :
			inventory [v] = 1


def addToInventory(inventory, addedItems) :
	for v in addedItems :
		# Get current value
		currentValue = inventory.get(v, 0)
		# Set new value
		newValue = currentValue + 1
		# Update dictionary
		inventory[v] = newValue
	  


