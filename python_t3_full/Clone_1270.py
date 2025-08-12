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


 def chose_item(event):
    w = event.widget
    x = 0
    index = int(w.curselection() [0])
    value = w.get(index)
    print ('You selected item %d: "%s"' % (index, value))
    for y in enable:
        for item in list_for_listbox:
            selected_checkbox = globals()['checkbox' + str(item) + str(y)]
            selected_checkbox.place_forget()
        selected_checkbox = globals()['checkbox' + str(value) + str(y)]
        selected_checkbox.place(x = 300, y = 0 + x)
        x += 50


