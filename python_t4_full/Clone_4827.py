def search(request) :
	if request.method == "GET" :
		search_terms = request.GET ['title']
		search_terms = search_terms.split(',')
		search_terms = set(search_terms)
		queryargs = [Q(title__contains = i) for i in search_terms]
		jobs = Job.objects.filter(* queryargs)




def search(request):
    if request.method == 'GET':
        search_terms = set(request.GET['title'].split(','))


