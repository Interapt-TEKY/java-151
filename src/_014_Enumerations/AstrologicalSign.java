package _014_Enumerations;

/**
 * Created by kpascascio on 10/6/16.
 */
public enum AstrologicalSign {
    AQUARIUS("January"),
    PISCES("Febuary"),
    ARIES("March"),
    TAURUS("April"),
    GEMINI("May"),
    CANCER("June"),
    LEO("July"),
    VIRGO("August"),
    LIBRA("September"),
    SCROPIO("October"),
    SAGITTARIO("November"),
    DECEMBER("December");

    private String horoSign;

    AstrologicalSign(String horoSign){
        this.horoSign = horoSign;
    }

    public String getHoroSign(){
        return horoSign;
    }

    public static String getMonth(String month){
        return month;
    }





}
