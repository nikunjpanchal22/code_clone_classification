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
    phone_number = None
    for items in soup.select("ul.list-unstyled") :
        phone_number = None
        try :
            phone_number = items.select_one("a[href^='tel:']").text
        except : 
            continue 
        else :
            if phone_number :
                print ('Phone Number of {} : {}'.format(title, phone_number))
                break



