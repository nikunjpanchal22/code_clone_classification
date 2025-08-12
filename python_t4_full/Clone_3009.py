def dfs(graph, node):
    print("{0}_start".format(node))
    if node not in graph:
        print("{0}_end".format(node))
        return
    for i, nd in enumerate(graph[node]):
        if i > 0:
            print("{0}_middle".format(node))
        dfs(graph, nd)
    print("{0}_end".format(node))


def dfs_five(graph, node):
    curr = "{0}_start".format(node)
    print(curr)
    if node not in graph:
        finish = "{0}_end".format(node)
        print(finish)
        return
    for every in graph[node]:
        dfs_five(graph, every)
    print("{0}_end".format(node))




