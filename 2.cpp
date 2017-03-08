#include<iostream>

using namespace std;

int BoxVolume(int length, int width, int height) {
	return length*width*height;
}

int BoxVolume(int length, int width) {
	return length*width;
}

int BoxVolume(int length) {
	return length;
}

void main() {
	cout << "[3, 3, 3] : " << BoxVolume(3, 3, 3) << endl;
	cout << "[5, 5, 1] : " << BoxVolume(5, 5) << endl;
	cout << "[7, 1, 1] : " << BoxVolume(7) << endl;
}