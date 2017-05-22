#include<iostream>
#include<cstdlib>
#include<time.h>
#include<Windows.h>
#include<conio.h>
using namespace std;
void main() {
	srand((unsigned)time(NULL));
	int card[52];
	int shape[3], number[3];
	int dest, sour, temp;
	int gameCount = 0, turn = 0;
	int betting, money = 1000;
	for (int i = 0; i < 52; i++)
		card[i] = i;
	for (int i = 0; i < 1000; i++) {
		dest = rand() % 52;
		sour = rand() % 52;
		temp = card[dest];
		card[dest] = card[sour];
		card[sour] = temp;
	}
	cout << "忙式式式式式式式式式式式式式式式忖" << endl;
	cout << "弛                              弛" << endl;
	cout << "弛    Red Dog (Betting Game)    弛" << endl;
	cout << "弛                              弛" << endl;
	cout << "戌式式式式式式式式式式式式式式式戎" << endl;
	cout << endl;
	cout << "        Start with any key" << endl;
	getch();
	system("cls");
	while (gameCount <= 17) {
		cout << "==============================================================" << endl;
		for (int i = 0; i < 3; i++) {
			shape[i] = card[i + turn] / 13;
			number[i] = card[i + turn] % 13;
			switch (shape[i]) {
			case 0:cout << "Ⅷ"; break;
			case 1:cout << "Ⅵ"; break;
			case 2:cout << "Ⅳ"; break;
			case 3:cout << "﹣"; break;
			}
			switch (number[i]) {
			case 0:cout << "A\t"; break;
			case 10:cout << "J\t"; break;
			case 11:cout << "Q\t"; break;
			case 12: cout << "K\t"; break;
			default: cout << number[i] + 1 << "\t"; break;
			}
		}
		cout << "Your Money : " << money << "\t";
		cout << "Betting : ";
		cin >> betting;
		if (betting > money) {
			cout << "Price for betting is too big." << endl;
			getch();
			system("cls");
			continue;
		}
		cout << "Result : ";
		if (number[0] < number[1]) {
			if (number[2] > number[0] && number[2] < number[1]) {
				cout << "You get " << betting << "!";
				money += betting;
			}
			else {
				cout << "Lose your money." << endl;
				money -= betting;
			}
		}
		else {
			if (number[2] < number[0] && number[2] > number[1]) {
				cout << "You get " << betting << "!";
				money += betting;
			}
			else {
				cout << "Lose your money." << endl;
				money -= betting;
			}
		}
		gameCount++;
		turn += 3;
		getch();
		system("cls");
	}
	system("cls");
	cout << "Your Final Money : " << money << endl;
	cout << "Game Over." << endl;
	getch();
}