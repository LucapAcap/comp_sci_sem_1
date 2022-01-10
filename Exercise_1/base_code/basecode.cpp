// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	int x=5;
	char quit = 'q';
	
	while(true){
		cout<<x<<endl;
		cin>>quit;
	if(quit=='q'){
		break;
	}
	if(x==25){
		break;
	}
	x=x+1;
	}
	cout<<endl; 
	
	int y=15;
	while(true){
		cout<<y<<endl;
		cin>>quit;
		if(quit=='q'){
			break;
		}
		if(y==5){
			break;
		}
		y=y-1;
	}
	
			cout<<y<<endl;
	for(int i=5; i<=25; i=i+1){
		cout<<i<<endl;
	}
cout<<y<<endl;
	for(int i=15; i>=5; i=i-1){
		cout<<i<<endl;

}
}


