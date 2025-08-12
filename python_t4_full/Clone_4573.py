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


        for city in cities:
            globals()["map{}{}".format(city, state)].hide()
        globals()["map{}{}".format(value, state)].place(x=300, y=0 + x)
        x += 50


 

def onselect(evt):
    w = evt.widget
    x = 0
    index = int(w.curselection()[0])
    value = w.get(index)


