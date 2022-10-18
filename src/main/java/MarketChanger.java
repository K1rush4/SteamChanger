public class MarketChanger {

    public static String MarketCacl(String StrSteamRub) {

        String str;

        try {
            int IntSteamRub = Integer.parseInt(StrSteamRub);

            if (IntSteamRub > 0) {
                double resoult = IntSteamRub / 1.15;
                str = Double.toString(resoult);
            } else {
                str = "Неверный формат данных";
            }
        } catch (Exception ex) {
            str = "Неверный формат данных";
        }

        return str;
    }


    public static String MarketKPD(String StrMarketRub, String StrSteamRub) {

        String str;

        try {
            int IntMarketRub = Integer.parseInt(StrMarketRub);
            int IntSteamRub = Integer.parseInt(StrSteamRub);

            if (IntMarketRub > 0 && IntSteamRub > 0) {
                double resoult = 100 * (IntSteamRub / 1.15) / IntMarketRub;
                str = Double.toString(resoult);
            } else {
                str = "Неверный формат данных";
            }
        } catch (Exception ex) {
            str = "Неверный формат данных";
        }

        return str;
    }
}
