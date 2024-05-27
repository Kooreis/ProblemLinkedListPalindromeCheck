using System;
using System.Collections.Generic;

public class Node
{
    public char Data;
    public Node Next;
    public Node(char c)
    {
        Data = c;
        Next = null;
    }
}