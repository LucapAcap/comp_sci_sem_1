// base code file
#include "./hfiles/poole.h"
#include <thread>

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));

cout<<"enter a snowflake symbol."<<endl;
char a;
cin>>a;
for(int snow=1; snow<7; snow++){
	gotoxy(20, snow+4);
	cout<<" "<<endl;
	gotoxy(20, snow+5);
	cout<<a<<endl;
	sleep(1);
	
}


}


