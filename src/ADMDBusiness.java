public class ADMDBusiness implements ADMDInformation {
    String businessName;
    String businessAddress;
    String businessType;

    public ADMDBusiness(String businessName, String businessAddress, String businessType) {
        this.businessName = businessName;
        this.businessAddress = businessAddress;
        this.businessType = businessType;
    }

        public void setName(String bname) {
            this.businessName = bname;
        }
        public void setAddress(String baddress) {
            this.businessAddress = baddress;
        }

        public String getAddress(){
            return businessAddress;
        }

        public String getName() {
            return businessName;
        }

        public String getBusinessType() {
            return businessType;
    }


}