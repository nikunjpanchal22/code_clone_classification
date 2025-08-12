def addToInventory(inventory, addedItems) :
	for item in addedItems :
		inventory.setdefault(item, 0)
		inventory[item] += 1


  def addToInventory(inventory, addedItems):
    for item in addedItems:
        if item in inventory.keys():
            inventory[item] += 1
        else:
            inventory[item] = 1


