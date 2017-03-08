#include<iostream>

using namespace std;

namespace LoveLive {
	void Hanayo(void) {
		cout << "Function defined by LoveLive" << endl;
	}
}

namespace Printemps {
	void Hanayo(void) {
		cout << "Function defined by Printemps" << endl;
	}
}

void main() {
	LoveLive::Hanayo();
	Printemps::Hanayo();
}