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


 
def select_action(event):
    widget = event.widget
    item_num = int(widget.curselection()[0])
    item_val = widget.get(item_num)
    print('You selected item %d: "%s"' % (item_num, item_val))
    for each_enable in enable:
        for every_item in list_for_listbox:
            check_box_name = f"checkbox{each_item}{each_enable}"
            globals()[check_box_name].place_forget()
        check_box_name = f"checkbox{item_val}{each_enable}"
        globals()[check_box_name].place(x = 300, y = 0 + x)


