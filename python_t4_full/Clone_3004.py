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


def dfs_nine(graph, node):
    start_node = "{0}_start".format(node)
    print(start_node)
    if node not in graph:
        end_node = "{0}_end".format(node)
        print(end_node)
        return
    for every_node in graph[node]:
        dfs_nine(graph, every_node)
    print("{0}_end".format(node))




