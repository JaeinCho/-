#include<iostream>
#include<conio.h>
using namespace std;
void main(){

	int num1, num2, num3, res = 0;
	cout << "[Example 01]" << endl;
	cout << "1st Integer : ";
	cin >> num1;
	cout << "2nd Integer : ";
	cin >> num2;
	cout << "3rd Integer : ";
	cin >> num3;
	res = num1 + num2 + num3;
	cout << "Sum : " << res << endl;
	getch();
	cout << endl << "[Example 02]" << endl;
	int i, j;
	cout << "Input Number : ";
	cin >> i;
	for (j = 1; j <= 9; j++) {
		cout << i << " x " << j << " = " << i*j << endl;
	}
	getch();
}