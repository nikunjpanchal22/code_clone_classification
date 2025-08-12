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


def dfs_seven(graph, node):
    begin = f"{node}_start"
    print(begin)
    if node not in graph:
        closing = f"{node}_end"
        print(closing)
        return
    for each in graph[node]:
        dfs_seven(graph, each)
    print(f"{node}_end")




