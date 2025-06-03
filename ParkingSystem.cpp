#include <iostream>
using namespace std;

class ParkingSystem {
private:
    int bigSlots;
    int mediumSlots;
    int smallSlots;

public:
    ParkingSystem(int big, int medium, int small) {
        bigSlots = big;
        mediumSlots = medium;
        smallSlots = small;
    }

    bool addCar(int carType) {
        if (carType == 1 && bigSlots > 0) {
            bigSlots--;
            return true;
        }
        if (carType == 2 && mediumSlots > 0) {
            mediumSlots--;
            return true;
        }
        if (carType == 3 && smallSlots > 0) {
            smallSlots--;
            return true;
        }
        return false;
    }
};

int main() {
    ParkingSystem ps(1, 1, 0);
    cout << ps.addCar(1) << endl; // 1
    cout << ps.addCar(2) << endl; // 1
    cout << ps.addCar(3) << endl; // 0
    cout << ps.addCar(1) << endl; // 0
    return 0;
}
