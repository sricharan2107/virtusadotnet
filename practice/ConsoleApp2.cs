using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Enter you number : ");
            int n = Convert.ToInt32(Console.ReadLine());
            string str = n.ToString();
            int r = 0;
            if (str.Length % 2 != 0)
            {
                while (n != 0)
                {
                    int rem = n % 10;
                    r = r * 10 + rem;
                    n = n / 10;

                }
                Console.WriteLine("reverse is " + r);
            }
            else
            {
                for (int i = str.Length / 2 - 1; i >= 0; i--)
                {
                    Console.Write(str[i]);
                }
                for (int i = str.Length-1; i >= str.Length/2; i--)
                {
                    Console.Write(str[i]);
                }
            }
            Console.ReadLine();

        }
    }
}
