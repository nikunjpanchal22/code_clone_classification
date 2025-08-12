def addToInventory(inventory, addedItems) :
	for v in addedItems :
		if v in inventory.keys() :
			inventory [v] += 1
		else :
			inventory [v] = 1


def addToInventory(inventory, addedItems) :
	for v in addedItems :
		if v in inventory :
			#Increment value by 1
			inventory[v] += 1
		#If not found
		else :
			#Add to inventory as new entry
			inventory.update({v: 1})
		


