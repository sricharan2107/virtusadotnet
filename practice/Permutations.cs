using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Permutations
{
    internal class Program
    {
        public static void permutation(String str, int l, int r)
        {
            if (l == r)
            {
                Console.WriteLine(str);
            }
            else
            {
                for (int i = 0; i <= r; i++)
                {
                    str = swap(str, l, i);
                    permutation(str, l + 1, r);
                    str = swap(str, l, i);
                }
            }
        }
        public static String swap(String a, int i, int j)
        {
            char t;
            char[] cA = a.ToCharArray();
            t = cA[i];
            cA[i] = cA[j];
            cA[j] = t;
            string s = new string(cA);
            return s;
        }
        static void Main(string[] args)
        {
            Console.Write("Enter the String : ");
            String s = Console.ReadLine();
            int n = s.Length;
            permutation(s, 0, n - 1);
            Console.ReadLine();
        }
    }
}
