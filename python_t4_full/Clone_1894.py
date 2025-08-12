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


            var_name = f"checkbox{item}{y}"
            globals()[var_name].place_forget()
        var_name = f"checkbox{val}{y}"
        globals()[var_name].place(x=300, y=0+x)
        x += 50

 
def select(event):
    browsing_widget = event.widget
    which_item = int(browsing_widget.curselection()[0])
    what_value = browsing_widget.get(which_item)
    print('You selected item %d: "%s"' % (which_item, what_value))
    x = 0 


