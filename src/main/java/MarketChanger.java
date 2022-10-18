import java.text.DecimalFormat;

public class MarketChanger {

    public String MarketCacl(String StrSteamRub) {

        String str;
        DecimalFormat df = new DecimalFormat("#.##");

        try {
            int IntSteamRub = Integer.parseInt(StrSteamRub);

            if (IntSteamRub > 0) {
                double resoult = IntSteamRub / 1.15;
                str = df.format(resoult);
            } else {
                str = "Неверный формат данных";
            }
        } catch (Exception ex) {
            str = "Неверный формат данных";
        }

        return str;
    }


    public String MarketKPD(String StrMarketRub, String StrSteamRub) {

        String str;
        DecimalFormat df = new DecimalFormat("#.##");

        try {
            int IntMarketRub = Integer.parseInt(StrMarketRub);
            int IntSteamRub = Integer.parseInt(StrSteamRub);

            if (IntMarketRub > 0 && IntSteamRub > 0) {
                double resoult = 100 * (IntSteamRub / 1.15) / IntMarketRub;
                str = df.format(resoult) + " %";
            } else {
                str = "Неверный формат данных";
            }
        } catch (Exception ex) {
            str = "Неверный формат данных";
        }

        return str;
    }
}