package ua.epam.task04.model.entity;

/**
 * Created by Denis Starovoitenko on 28.07.2017.
 */
public class PhoneNumber {
    private String home;
    private String mobile;
    private String mobileAdd;

    public PhoneNumber(){
        this("","","");
    }

    public PhoneNumber(String home, String mobile){
        this(home, mobile, "");
    }

    public PhoneNumber(String home, String mobile, String mobileAdd){
        this.home = home;
        this.mobile = mobile;
        this.mobileAdd = mobileAdd;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobileAdd() {
        return mobileAdd;
    }

    public void setMobileAdd(String mobileAdd) {
        this.mobileAdd = mobileAdd;
    }

    @Override
    public String toString() {
        return "Phone numbers:" + "\n\tHome: " + home
                +"\n\tMobile: " + mobile + "\n\tAdditional mobile: " + mobileAdd;
    }
}
