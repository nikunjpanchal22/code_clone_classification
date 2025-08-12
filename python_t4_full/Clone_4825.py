def search(request) :
	if request.method == "GET" :
		search_terms = request.GET ['title']
		search_terms = search_terms.split(',')
		search_terms = set(search_terms)
		queryargs = [Q(title__contains = i) for i in search_terms]
		jobs = Job.objects.filter(* queryargs)


        jobs = Job.objects.filter(reduce(lambda x, y: x | y, [Q(title__contains=word) for word in search_terms]))



def search(request):
    if request.method == "GET":
        search_terms = set(request.GET.get('title', '').split(','))
        query = Q()


