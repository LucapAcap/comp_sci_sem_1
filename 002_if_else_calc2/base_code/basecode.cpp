// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
int a=1;
int b=1;
char c;
char add;
add = '+';
char sub;
sub = '-';
char mult;
mult = '*';
char divi;
divi = '/';
cout<<"First number?"<<endl;
cin>>a;
cout<<"Second number?"<<endl;
cin>>b;
cout<<"What operation? (+,-,*,/)"<<endl;
cin>>c;
int ans1 = a+b;
int ans2 = a-b;
int ans3 = a*b;
int ans4 = a/b;

if(c==add){
    cout<<"Answer is "<<ans1<<endl;
}
else if(c==sub){
    cout<<"Answer is "<<ans2<<endl;
}
else if(c==mult){
    cout<<"Answer is "<<ans3<<endl;
}
else if(c==divi){
    cout<<"Answer is "<<ans4<<endl;
}
else{
    cout<<"Pick a correct operation."<<endl;
}
}