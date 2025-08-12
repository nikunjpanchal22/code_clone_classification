def onselect(evt) :
	w = evt.widget
	x = 0
	index = int(w.curselection() [0])
	value = w.get(index)
	print ('You selected item %d: "%s"' % (index, value))
	for y in enable :
		for item in list_for_listbox :
			globals() ["checkbox{}{}".format(item, y)].place_forget()
		globals() ["checkbox{}{}".format(value, y)].place(x = 300, y = 0 + x)
		x += 50


    for y in enable:
        for item in list_for_listbox:
            checkbox_name = f"checkbox{item}{y}" 
            globals()[checkbox_name].place_forget()
        checkbox_name = f"checkbox{val_item}{y}"
        globals()[checkbox_name].place(x = 300, y = 0 + x)
        x += 50

 
def pick(event):
    component = event.widget
    item_index = int(component.curselection()[0])
    item_value = component.get(item_index)
    print('You selected item %d: "%s"' % (item_index, item_value))
    x = 0 

    for y in enable:
        for item in list_for_listbox:
            name = f"checkbox{item}{y}"
            globals()[name].place_forget()
        name = f"checkbox{item_value}{y}"
        globals()[name].place(x = 300, y = 0 + x)
        x += 50


