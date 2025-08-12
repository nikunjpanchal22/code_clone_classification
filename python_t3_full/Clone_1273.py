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


        x += 50

 
def on_select(event):
    widget = event.widget
    index = int(widget.curselection()[0])
    value = widget.get(index)
    print('You selected item %d: "%s"' % (index, value))
    x = 0 

    for y in enable:
        for item in list_for_listbox:
            name_of_checkbox = f"checkbox{item}{y}"
            globals()[name_of_checkbox].place_forget()


