#include <iostream>
#include <string>
#include <iomanip>
#include <stdexcept>
#include <utility>
using namespace std;

class LedgerEntry {
    string description;
    double* amounts;
    int days;

public:
    static int totalEntries;

    LedgerEntry(string desc, int d) {
        description = desc;
        days = d;
        amounts = new double[days];

        for (int i = 0; i < days; i++)
            amounts[i] = 0;

        totalEntries++;

        cout << "Created: " << description << endl;
    }

    LedgerEntry(const LedgerEntry& other) {
        description = other.description;
        days = other.days;
        amounts = new double[days];

        for (int i = 0; i < days; i++)
            amounts[i] = other.amounts[i];

        totalEntries++;

        cout << "Copy Created: " << description << endl;
    }

    LedgerEntry(LedgerEntry&& other) noexcept {
        description = move(other.description);
        amounts = other.amounts;
        days = other.days;

        other.amounts = nullptr;
        other.days = 0;

        totalEntries++;

        cout << "Move Created" << endl;
    }

    LedgerEntry& operator=(const LedgerEntry& other) {
        if (this != &other) {
            delete[] amounts;

            description = other.description;
            days = other.days;

            amounts = new double[days];

            for (int i = 0; i < days; i++)
                amounts[i] = other.amounts[i];
        }

        return *this;
    }

    LedgerEntry& operator=(LedgerEntry&& other) noexcept {
        if (this != &other) {
            delete[] amounts;

            description = move(other.description);
            amounts = other.amounts;
            days = other.days;

            other.amounts = nullptr;
            other.days = 0;
        }

        return *this;
    }

    ~LedgerEntry() {
        delete[] amounts;
        totalEntries--;

        cout << "Destroyed: " << description << endl;
    }

    double& operator[](int index) {
        if (index < 0 || index >= days)
            throw out_of_range("Invalid index");

        return amounts[index];
    }

    const double& operator[](int index) const {
        if (index < 0 || index >= days)
            throw out_of_range("Invalid index");

        return amounts[index];
    }

    LedgerEntry operator+(const LedgerEntry& other) const {
        int n = min(days, other.days);

        LedgerEntry result("Combined", n);

        for (int i = 0; i < n; i++)
            result.amounts[i] = amounts[i] + other.amounts[i];

        return result;
    }

    bool operator==(const LedgerEntry& other) const {
        double sum1 = 0;
        double sum2 = 0;

        for (int i = 0; i < days; i++)
            sum1 += amounts[i];

        for (int i = 0; i < other.days; i++)
            sum2 += other.amounts[i];

        return sum1 == sum2;
    }

    bool operator>(const LedgerEntry& other) const {
        double sum1 = 0;
        double sum2 = 0;

        for (int i = 0; i < days; i++)
            sum1 += amounts[i];

        for (int i = 0; i < other.days; i++)
            sum2 += other.amounts[i];

        return sum1 > sum2;
    }

    void setAmount(int index, double value) {
        if (index < 0 || index >= days)
            throw out_of_range("Invalid index");

        amounts[index] = value;
    }

    bool isEmpty() const {
        return amounts == nullptr && days == 0;
    }

    friend ostream& operator<<(ostream& out, const LedgerEntry& entry);
    friend istream& operator>>(istream& in, LedgerEntry& entry);
};

int LedgerEntry::totalEntries = 0;

ostream& operator<<(ostream& out, const LedgerEntry& entry) {
    out << entry.description << " : [";

    for (int i = 0; i < entry.days; i++) {
        out << fixed << setprecision(2) << entry.amounts[i];

        if (i < entry.days - 1)
            out << ", ";
    }

    out << "]";

    double total = 0;

    for (int i = 0; i < entry.days; i++)
        total += entry.amounts[i];

    out << " Total = " << fixed << setprecision(2) << total;

    return out;
}

istream& operator>>(istream& in, LedgerEntry& entry) {
    for (int i = 0; i < entry.days; i++)
        in >> entry.amounts[i];

    return in;
}

int main() {

    LedgerEntry jan("January", 5);
    jan.setAmount(0, 1000);
    jan.setAmount(1, 2000);
    jan.setAmount(2, 1500);
    jan.setAmount(3, 2500);
    jan.setAmount(4, 3000);

    LedgerEntry feb("February", 5);
    feb.setAmount(0, 1200);
    feb.setAmount(1, 1800);
    feb.setAmount(2, 1600);
    feb.setAmount(3, 2200);
    feb.setAmount(4, 3100);

    cout << "\nJanuary: " << jan << endl;
    cout << "February: " << feb << endl;

    LedgerEntry combined = jan + feb;

    cout << "\nCombined: " << combined << endl;

    cout << "\nJanuary == February: "
         << (jan == feb ? "YES" : "NO") << endl;

    cout << "January > February: "
         << (jan > feb ? "YES" : "NO") << endl;

    LedgerEntry moved = move(jan);

    cout << "\nAfter move, jan is empty: "
         << (jan.isEmpty() ? "YES" : "NO") << endl;

    LedgerEntry q1("Q1", 5);

    q1 = move(feb);

    cout << "\nAfter move assignment, feb is empty: "
         << (feb.isEmpty() ? "YES" : "NO") << endl;

    cout << "\nQ1: " << q1 << endl;

    cout << "\nLive LedgerEntry objects: "
         << LedgerEntry::totalEntries << endl;

    return 0;
}