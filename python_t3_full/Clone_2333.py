def parse(self, response) :
	hxs = HtmlXPathSelector(response)
	sites = hxs.select('//div[@id="col_3"]//div[@id="module3_1"]//div[@id="moduleData4952"]')
	items = []
	for site in sites :
		item = Website()
		item ['header'] = site.select('//div[@class="scoreboard-bar"]//h2//span[position()>1]//text()').extract()
		item ['game1'] = site.select('/*//table[position()=1]//tr//td[@class="tbl-odds-c2"]//text() | /*//table[position()=1]//tr//td[@class="tbl-odds-c4"]//text() | /*//table[position()=1]//tr//td[@class="tbl-odds-c6"]//text()').extract()
		items.append(item)
	self.task_urls.remove(response.url)
	if self.task_urls :
		r = Request(url = self.task_urls [0], callback = self.parse)
		items.append(r)
	return items


        itemList.append(r)
    return itemList



def parse(self, response):
    hxs = HtmlXPathSelector(response)
    sites = hxs.xpath('//div[@id="main_section"]//div[@id="block1"]//div[@id="blockData349"]')
    itemsList = []
    for site in sites:
        item = Page()
        item['pageHeader'] = site.xpath('//div[@class="header-section"]//h2//span[position()>1]//text()').extract()
        item['pageData'] = site.xpath('/*//table[position()=1]//tr//td[@class="tbl-page-c2"]//text() | /*//table[position()=1]//tr//td[@class="tbl-page-c4"]//text() | /*//table[position()=1]//tr//td[@class="tbl-page-c6"]//text()').extract()
        itemsList.append(item)
    self.task_urls.remove(response.url)


