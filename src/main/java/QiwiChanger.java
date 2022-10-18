import java.text.DecimalFormat;

public class QiwiChanger {
    final double QiwiToSteam = 0.83;

    public String main(String StrQiwiRub) {

        String str;
        DecimalFormat df = new DecimalFormat("#.##");

        try {
            int IntQiwiRub = Integer.parseInt(StrQiwiRub);

            if (IntQiwiRub > 0) {
                double resoult = IntQiwiRub * QiwiToSteam;
                str = df.format(resoult);
            }
            else{
                str = "Неверный формат данных";
            }
        }

        catch (Exception ex) {
            str = "Неверный формат данных";
        }

        return str;
    }
}