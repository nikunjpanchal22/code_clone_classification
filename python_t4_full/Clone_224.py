def addToInventory(inventory, addedItems) :
	for v in addedItems :
		if v in inventory.keys() :
			inventory [v] += 1
		else :
			inventory [v] = 1


def addToInventory(inventory, addedItems) :
	for v in addedItems :
		# Get item's current value
		itemValue = inventory.get(v, 0)
		# Increment value by 1
		inventory[v] = itemValue + 1


