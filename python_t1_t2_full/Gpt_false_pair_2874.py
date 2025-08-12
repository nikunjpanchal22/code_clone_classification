def scraper(pageNum) :
	while pageNum < SOME_TARGET_VALUE :
		req = Request("http://www.someurl.com/Search/page=" + str(pageNum) + "&facet_Category=20", headers = {"User-Agent" : "Mozilla/5.0"})
		html = urlopen(req).read()
		bsObj = BeautifulSoup(html)
		for result in bsObj.select("h2 a") :
			print (result ["href"])
		pageNum += 1




def scraper(pageNum) :
	while pageNum < SOME_TARGET_VALUE :
		req = Request("http://www.someurl.com/Search/page=" + str(pageNum) + "&facet_Category=20", headers = {"User-Agent" : "Mozilla/5.0"})
		html = urlopen(req).read()
		bsObj = BeautifulSoup(html)
		for result in bsObj.find_all('h2') :
			print (result.a["href"])
		pageNum += 1

