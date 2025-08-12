def addToInventory(inventory, addedItems) :
	for v in addedItems :
		if v in inventory.keys() :
			inventory [v] += 1
		else :
			inventory [v] = 1


def addToInventory(inventory, addedItems) :
        for v in addedItems :
                #If value in inventory
                if v in inventory :
                        inventory[v] = inventory[v] +1
                #If value NOT in inventory
                else :
                        inventory[v] = 1



