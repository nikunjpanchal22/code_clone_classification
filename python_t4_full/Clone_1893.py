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


        for item in list_for_listbox:
            what_checkbox = f"checkbox{item}{y}"
            globals()[what_checkbox].place_forget()
        what_checkbox = f"checkbox{what_value}{y}"
        globals()[what_checkbox].place(x = 300, y = 0 + x)
        x += 50

 
def selecting(evt):
    w_widget = evt.widget
    identif_item = int(w_widget.curselection()[0])
    val_item = w_widget.get(identif_item)
    print('You selected item %d: "%s"' % (identif_item, val_item))
    x = 0 


