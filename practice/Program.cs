using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter a string");
            String s = Console.ReadLine();
            String ns = "";
            foreach (var c in s)
            {
                int n = (int)c;
                if (n >= 119)
                {
                    n = n - 23;
                    Console.Write((char)n );
                }
                else {
                    n = n + 3;
                    Console.Write((char)n); 
                }
            }
            Console.ReadLine();
        }
    }
}
