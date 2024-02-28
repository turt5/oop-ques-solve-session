package fall_22.q3;

public class Bus extends Vehicle{
    private int licenseNo;

    public Bus(int licenseNo) {
        super(4);
        this.licenseNo = licenseNo;
    }

    public void setLicenseNo(int licenseNo){
        this.licenseNo=licenseNo;
    }

    public int getLicenseNo(){
        return this.licenseNo;
    }
}
