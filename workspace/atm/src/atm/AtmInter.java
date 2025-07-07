package atm;

public interface AtmInter {

	void deposit (int money)throws NumberFormatException;
    void withdrawal(int money)throws NumberFormatException; 
}
