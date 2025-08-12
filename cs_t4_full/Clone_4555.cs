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


 static void Main(string[] args)
{
    List<Edge> EDGES = new List<Edge>();
    EDGES.Add(new Edge(new Point(5, 50), new Point(20, 100)));
    EDGES.Add(new Edge(new Point(20, 100), new Point(30, 50)));
    EDGES.Add(new Edge(new Point(30, 50), new Point(10, 0)));
    EDGES.Add(new Edge(new Point(5, 50), new Point(30, 50)));
    EDGES.Add(new Edge(new Point(5, 50), new Point(10, 0)));
    EDGES.Add(new Edge(new Point(20, 100), new Point(80, 100)));
    EDGES.Add(new Edge(new Point(10, 0), new Point(80, 100)));

    List<double[]> points = new List<double[]>();

    foreach (Edge edge in EDGES)
    {
        points.Add(new double[] {edge.P1.X, edge.P1.Y});
        points.Add(new double[] {edge.P2.X, edge.P2.Y});
    }

    for (int i = 0; i < points.Count; i++)
    {
        Console.WriteLine($"{i} {points[i][0], points[i][1]}");
    }

    Console.WriteLine();

    int[,] edgeIndices = new int[EDGES.Count, 2];

    for (int i = 0; i < EDGES.Count; i++)
    {
        Edge edge = EDGES[i];
        int point1Index = points.FindIndex(p => p[0] == edge.P1.X && p[1] == edge.P1.Y);
        int point2Index = points.FindIndex(p => p[0] == edge.P2.X && p[1] == edge.P2.Y);

        edgeIndices[i, 0] = point1Index;
        edgeIndices[i, 1] = point2Index;
    }

    for (int i = 0; i < edgeIndices.GetLength(0); i++)
    {
        Console.WriteLine($"({edgeIndices[i, 0], edgeIndices[i, 1]})");
    }

    Console.ReadKey(true);
}


