#include<iostream>
#include<cstdlib>
using namespace std;
int gcd(int n,int m)
{
  if((n>=m)&&((n%m)==0))
    return(m);
  else
    gcd(m,(n%m));
}
int main()
{
  int n,m,result;
  cin>>n;
  cin>>m;
  result=gcd(n,m);
  cout<<"G.C.D of "<<n<<" and "<<m<<" = "<<result;
  return 0;
}
