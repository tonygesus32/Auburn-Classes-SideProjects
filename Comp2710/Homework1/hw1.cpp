    // Name: Anthony Tolbert
    // Auburn User Id: azt0052@auburn.edu
    // Filename: hw1.cpp
    // How to complie: Use g++ compiler to compile


	//Demonstrates a class string.
	#include <iostream>
	#include <string> 
	using namespace std;
  
  
	int main ()
{
	const double FR = 0.001;
	double humasweet;
	double humaweight;
	double mseweight;
	double msesweet;
	double sda;
	
	
	cout << "\nWhat is the amount of artificial sweetener needed to kill a mouse: ";
	cin >> msesweet;
	
	cout << "\nWhat is the weight of the mouse: ";
	cin >> mseweight;
	
	cout << "\nWhat is the weight of the dieter: ";
	cin >> humaweight;
	
	humasweet = (msesweet / mseweight) * humaweight;
	sda = (humasweet / FR);
	
	
	cout << "\nYou can drink " << sda << " diet soda without dying as a result." << endl;
	return 0;
}
