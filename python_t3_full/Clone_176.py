def addToInventory(inventory, addedItems) :
	for item in addedItems :
		inventory.setdefault(item, 0)
		inventory[item] += 1


  def addToInventory(inventory, addedItems):
    for item in addedItems:
        if item not in inventory:
            inventory[item] = 0
        inventory[item] += 1


