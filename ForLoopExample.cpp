#include <iostream>
#include <cstdio>
using namespace std;

int main() {
    // Complete the code.
    
    int a,b;
    cin>>a;
    cin>>b;
    
    string numString []={"","one","two","three","four","five","six","seven","eight","nine"};
    
    for(; a <= b; a++) {
        if(a <= 9)
            cout<<numString[a]+"\n";
        else if(a % 2 == 0)
            cout<<"even \n";
        else 
            cout<<"odd \n";
    }
    return 0;
}

