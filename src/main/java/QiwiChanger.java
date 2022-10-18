public class QiwiChanger {
    final static double QiwiToSteam = 0.83;

    public static String main(String StrQiwiRub) {

        String str;

        try {
            int IntQiwiRub = Integer.parseInt(StrQiwiRub);

            if (IntQiwiRub > 0) {
                double resoult = IntQiwiRub * QiwiToSteam;
                str = Double.toString(resoult);
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