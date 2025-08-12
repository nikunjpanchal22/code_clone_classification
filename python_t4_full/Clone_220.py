def addToInventory(inventory, addedItems) :
	for item in addedItems :
		inventory.setdefault(item, 0)
		inventory[item] += 1


  def addToInventory(inventory, addedItems):
    for item in addedItems:
        if inventory.get(item) == None:
            inventory[item] = 1
        else:
            inventory[item] += 1


