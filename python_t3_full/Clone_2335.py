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


    if self.task_urls:
        r = Request(url = self.task_urls[0], callback = self.parse)
        blogItems.append(r)
    return blogItems



def parse(self, response):
    selector = HtmlXPathSelector(response)
    sites = selector.xpath('//div[@id="main"]//div[@id="block_1"]//div[@id="block_data_9999"]')
    itemList = []
    for site in sites:
        item = WebsitePage()
        item['header_title'] = site.xpath('//div[@class="header-section"]//h1//span[position()>1]//text()').extract()
        item['page_data'] = site.xpath('/*//table[position()=1]//tr//td[@class="tbl-data-c2"]//text() | /*//table[position()=1]//tr//td[@class="tbl-data-c4"]//text() | /*//table[position()=1]//tr//td[@class="tbl-data-c6"]//text()').extract()


