def get_info(session, title, url) :
	r = session.get(url)
	soup = BeautifulSoup(r.text, "lxml")
	for items in soup.select("ul.list-unstyled") :
		try :
			phone = items.select_one("a[href^='tel:']").text
		except :
			continue
		else :
			print (title, phone)
			break


def get_info (session, title, url) :
    r = session.get(url)
    soup = BeautifulSoup(r.text, "lxml")
    phone_numbers = None
    for items in soup.select("ul.list-unstyled") :
        try:
            phone_numbers = items.select_one("a[href^='tel:']").text
        except :
            continue
        else:
            if phone_numbers :
                print ('Phone Numbers Associated with {} : {}'.format(title, phone_numbers))
                break
