#include <bits/stdc++.h>
using namespace std;

typedef long long ll;

int main()
{
   int n;
  std::cin >> n;
  int input[n];
  int output[n];
  int count=1;
  for(int i=0;i<n;i++){
    std::cin >> input[i];
}
  output[0]=1;
  for(int i=1; i<n;i++) {
    if(input[i]<=input[i-1]){
      output[i]=1;
    }else {
      output[i]=count*2;
      count=count+1;
    }
  }
  for(int i=0;i<n;i++){
    std::cout << output[i]<<endl;
  }
  return 0;
}
