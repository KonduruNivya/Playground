#include<iostream>
using namespace std;
int Fibonacci(int n)
{
  if (n <= 1)
    return n;
  return Fibonacci(n - 1) + Fibonacci(n - 2);
}
int main()
{
  int n;
  cin >> n;
  cout << "The term "<< n << " in the fibonacci series is ";
  cout << Fibonacci(n - 1);
}