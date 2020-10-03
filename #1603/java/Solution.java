/**
* https://leetcode.com/problems/design-parking-system
* Runtime: 6 ms, faster than 100.00% of Java online submissions
* Memory Usage: 39.3 MB, less than 100.00% of Java online submissions
*/
class ParkingSystem {

    int bs;
    int ms;
    int ss;
    
    public ParkingSystem(int big, int medium, int small) {
        bs = big;
        ms = medium;
        ss = small;
    }
    
    public boolean addCar(int carType) {
        if(carType==1){
            if(bs>0) {
                bs--;
                return true;
            }
        } else if(carType==2){
            if(ms>0) {
                ms--;
                return true;
            }
        } else if(carType==3){
            if(ss>0) {
                ss--;
                return true;
            }
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
