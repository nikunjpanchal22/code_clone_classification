static void Main (string [] args) {
    var EDGES = new List < Edge > ();
    EDGES.Add (new Edge (new Point (5, 50), new Point (20, 100)));
    EDGES.Add (new Edge (new Point (20, 100), new Point (30, 50)));
    EDGES.Add (new Edge (new Point (30, 50), new Point (10, 0)));
    EDGES.Add (new Edge (new Point (5, 50), new Point (30, 50)));
    EDGES.Add (new Edge (new Point (5, 50), new Point (10, 0)));
    EDGES.Add (new Edge (new Point (20, 100), new Point (80, 100)));
    EDGES.Add (new Edge (new Point (10, 0), new Point (80, 100)));
    var POINTS = new List < double [] > (EDGES.Count * 2);
    FillPoints (EDGES, ref POINTS);
    for (int i = 0; i < POINTS.Count; i ++) {
        Console.WriteLine ("{0} {1} {2}", i, POINTS [i] [0], POINTS [i] [1]);
    }
    Console.WriteLine ();
    var edgeIndices = new int [EDGES.Count, 2];
    FillEdges (EDGES, POINTS, ref edgeIndices);
    for (int i = 0; i < edgeIndices.GetLength (0); i ++) {
        Console.WriteLine ("({0}, {1})", edgeIndices [i, 0], edgeIndices [i, 1]);
    }
    Console.ReadKey (true);
}


 static void Main (string [] args) {
    List<Edge> EDGES = new List<Edge>();
    EDGES.Add(new Edge(new Point(5, 50), new Point(20, 100))); 
    EDGES.Add(new Edge(new Point(20, 100), new Point(30, 50))); 
    EDGES.Add(new Edge(new Point(30, 50), new Point(10, 0))); 
    EDGES.Add(new Edge(new Point(5, 50), new Point(30, 50))); 
    EDGES.Add(new Edge(new Point(5, 50), new Point(10, 0))); 
    EDGES.Add(new Edge(new Point(20, 100), new Point(80, 100))); 
    EDGES.Add(new Edge(new Point(10, 0), new Point(80, 100))); 

    List<Tuple<double, double>> points = new List<Tuple<double, double>>();

    foreach (Edge edge in EDGES)
    {
        points.Add(Tuple.Create(edge.P1.X, edge.P1.Y));
        points.Add(Tuple.Create(edge.P2.X, edge.P2.Y));
    }

    for (int i = 0; i < points.Count; i++)
    {
        Console.WriteLine($"{i} {points[i].Item1, points[i].Item2}");
    }

    Console.WriteLine();
    int[,] edgeIndices = new int[EDGES.Count, 2];

    for (int i = 0; i < EDGES.Count; i++)
    {
        Edge edge = EDGES[i];
        edgeIndices[i, 0] = points.FindIndex(p => p == Tuple.Create(edge.P1.X, edge.P1.Y));
        edgeIndices[i, 1] = points.FindIndex(p => p == Tuple.Create(edge.P2.X, edge.P2.Y));
    }

    for (int i = 0; i < edgeIndices.GetLength(0); i++)
    {
        Console.WriteLine($"({edgeIndices[i, 0], edgeIndices[i, 1]})");
    }

    Console.ReadKey(true);

}


